/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Coleccion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mikka
 */
public class CollectionConnection extends ConnectionDatabase {

    public boolean AddCarta(Carta card, Coleccion col) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement(""
                + "INSERT INTO cartacoleccion (" + col.getId() + ", " + card.getId() + ",)\n"
                + "");
        if (ps.execute()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean RemoveCarta(Carta card, Coleccion col) throws SQLException {
        Statement ps = getConnection().createStatement();
        String sql = "DELETE cartacoleccion \n"
                + "where idcoleccion = " + col.getId() + "\n"
                + "and idcarta = " + card.getId() + ")";
        if (ps.executeUpdate(sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addCollection(Coleccion col, int id_usuario) throws SQLException{
        PreparedStatement ps = getConnection().prepareStatement(""
                + "INSERT INTO coleccion (" + col.getId() + ", "+ id_usuario +", " + col.getType().toLowerCase() + ")\n"
                + "");
        if (ps.execute()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean modifyCollection() {
        return false;
    }

    public boolean deleteCollection() {
        return false;   
    }

}
