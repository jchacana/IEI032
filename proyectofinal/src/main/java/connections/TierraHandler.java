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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikka
 */
public class TierraHandler extends CardConnectionHandler {

    @Override
    public List<PreparedStatement> handleAdd(Carta card, Connection con) throws SQLException {
        if (Tierra.class == card.getClass()) {
            PreparedStatement prepStatCard = con.prepareStatement(prepareCardStatement(card));
            PreparedStatement prepStatTir = con.prepareStatement(""
                    + "INSERT INTO carta VALUES"
                    + "(null, \""
                    + ((Tierra) card).getMana() + "\", "
                    + card.getId()
                    + ")"
            );
            List<PreparedStatement> lista = new ArrayList<>();
            lista.add(prepStatCard);
            lista.add(prepStatTir);
            return lista;
        }
        throw new SQLException("Error al agregar");
    }

    @Override
    public List<PreparedStatement> handleModify(Carta card, Connection con) throws SQLException {
        if (Tierra.class == card.getClass()) {
            List<PreparedStatement> lista = new ArrayList<>();
            return lista;
        } else {
            successor.handleAdd(card, con);
        }
        throw new SQLException("Error al agregar");
    }
}