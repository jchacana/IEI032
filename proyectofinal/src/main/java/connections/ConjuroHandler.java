/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Conjuro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikka
 */
public class ConjuroHandler extends CardConnectionHandler {

    @Override
    public List<PreparedStatement> handleAdd(Carta card, Connection con) throws SQLException {
        if (Conjuro.class == card.getClass()) {
            PreparedStatement prepStatCard = con.prepareStatement(prepareCardStatement(card));
            PreparedStatement prepStatConj = con.prepareStatement(""
                    + "INSERT INTO carta VALUES"
                    + "(null, \""
                    + ((Conjuro) card).getTipo() + "\", "
                    + card.getId()
                    + ")"
            );
            List<PreparedStatement> lista = new ArrayList<>();
            lista.add(prepStatCard);
            lista.add(prepStatConj);
            return lista;
        } else {
            successor.handleAdd(card, con);
        }
        throw new SQLException("Error al agregar");
    }

    @Override
    public List<PreparedStatement> handleModify(Carta card, Connection con) throws SQLException {
        if (Conjuro.class == card.getClass()) {
            List<PreparedStatement> lista = new ArrayList<>();
            return lista;
        } else {
            successor.handleAdd(card, con);
        }
        throw new SQLException("Error al agregar");
    }
}
