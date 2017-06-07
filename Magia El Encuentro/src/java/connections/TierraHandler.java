/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Tierra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author migue
 */
public class TierraHandler extends ConnectionHandler{
    
    @Override
    public void handleAdd(Carta card, Connection con) throws SQLException {
        if (Tierra.class == card.getClass()) {
            PreparedStatement prepStatCard = con.prepareStatement(prepareCardStatement(card));
            PreparedStatement prepStatConj = con.prepareStatement(""
                    + "INSERT INTO carta VALUES"
                    + "(null, \""
                    + ((Tierra) card).getMana()+ "\", "
                    + card.getId()
                    + ")"
            );
            if (executePrepStat(prepStatCard) && executePrepStat(prepStatConj)) {
                System.out.println("Tierra agregada");
            }
        } else {
            successor.handleAdd(card, con);
        }
    }

    @Override
    public void handleModify(Carta card, Connection con) throws SQLException {
        if (Tierra.class == card.getClass()) {

        } else {
            successor.handleAdd(card, con);
        }
    }

    private boolean executePrepStat(PreparedStatement prepStat) {
        try {
            return prepStat.execute();
        } catch (SQLException ex) {
            System.out.println("Error al agregar: " + ex.getMessage());
            return false;
        }
    }
}
