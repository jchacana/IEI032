/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Conjuro;
import data.Criatura;
import data.Tierra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Mikka
 */
public class CardConnection extends ConnectionDatabase {

    public static void main(String[] args) {
        CardConnection cc = new CardConnection();
        int id = cc.getSequence();
        Carta.setId(id);
        Carta conjuro = new Conjuro("hechizo", "testConjuro", 0, "none", "none", "This is a test");
        System.out.println("" + conjuro.getId());
        Carta criatura = new Criatura(0, 0, "testCriatura", 0, "none", "none", "This is a test");
        System.out.println("" + criatura.getId());
        Carta tierra = new Tierra(0, "testTierra", 0, "none", "none", "this is a test");
        System.out.println("" + tierra.getId());
        cc.addCarta(conjuro);
        System.out.println("conjuro");
        cc.addCarta(criatura);
        System.out.println("criatura");
        cc.addCarta(tierra);
        System.out.println("tierra");
    }

    private CardConnectionHandler setHandlers() {
        CardConnectionHandler h1 = new ConjuroHandler();
        CardConnectionHandler h2 = new CriaturaHandler();
        CardConnectionHandler h3 = new TierraHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        return h1;
    }

    public boolean addCarta(Carta carta) {
        try {
            List<String> prList = setHandlers().handleAdd(carta);
            System.out.println("connections.CardConnection.addCarta()");
            Connection con = getConnection();
            for (String string : prList) {
                System.out.println(string);
            }
            boolean validate = false;
            for (String iterator: prList) {
                PreparedStatement ps = con.prepareStatement(iterator);
                validate = ps.execute();
            }
            return validate;

        } catch (SQLException e) {
            closeConnection();
            System.out.println("Error:" + e.getMessage());
            return false;
        }
    }

    public boolean modifyCarta(Carta carta) {
        try {
            List<String> prList = setHandlers().handleModify(carta);
            
                return true;

        } catch (SQLException e) {
            closeConnection();
            System.out.println("Error:" + e.getMessage());
            return false;
        }
    }

    public boolean deleteCarta(int id) {
        try {
            PreparedStatement prStat = getConnection().prepareStatement("DELETE FROM carta WHERE id = " + id);
            prStat.execute();
            closeConnection();
            return true;
        } catch (SQLException e) {
            closeConnection();
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    private int getSequence() {
        int id;
        try {
            PreparedStatement prStat = getConnection().prepareStatement("SELECT `AUTO_INCREMENT` as lastid\n"
                    + "FROM  INFORMATION_SCHEMA.TABLES\n"
                    + "WHERE TABLE_NAME   = 'carta';");
            ResultSet rs = prStat.executeQuery();
            rs.next();
            id = rs.getInt("lastid")-1;
            closeConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            id = 0;
        }
        return id;
    }
}
