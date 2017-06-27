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
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mikka
 */
public class ConjuroHandler extends CardConnectionHandler {

    @Override
    public List<String> handleAdd(Carta card) throws SQLException {
        if (Conjuro.class == card.getClass()) {
            String prepStatCard = prepareCardStatement(card);
            String prepStatConj = (""
                    + "INSERT INTO cartaconjuro(id, tipoDeHechizo, carta_id) VALUES"
                    + "(default, \""
                    + ((Conjuro) card).getTipo() + "\", "
                    + card.getId()
                    + ")"
            );
            List<String> lista = new ArrayList<>();
            lista.add(prepStatCard);
            lista.add(prepStatConj);
            for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                System.out.println(""+next);
            }
            return lista;
        } else {
            return successor.handleAdd(card);
        }
    }

    @Override
    public List<String> handleModify(Carta card) throws SQLException {
        if (Conjuro.class == card.getClass()) {
            List<String> lista = new ArrayList<>();
            return lista;
        } else {
            successor.handleAdd(card);
        }
        throw new SQLException("Error al agregar");
    }
}
