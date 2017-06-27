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
    public List<String> handleAdd(Carta card) throws SQLException {
        if (Tierra.class == card.getClass()) {
            String prepStatCard =(prepareCardStatement(card));
            String prepStatTir = (""
                    + "INSERT INTO cartatierra VALUES"
                    + "(default, "
                    + ((Tierra) card).getMana() + ", "
                    + card.getId()
                    + ")"
            );
            List<String> lista = new ArrayList<>();
            lista.add(prepStatCard);
            lista.add(prepStatTir);
            return lista;
        }
        throw new SQLException("Error al agregar");
    }

    @Override
    public List<String> handleModify(Carta card) throws SQLException {
        if (Tierra.class == card.getClass()) {
            List<String> lista = new ArrayList<>();
            return lista;
        } else {
            return successor.handleAdd(card);
        }

    }
}