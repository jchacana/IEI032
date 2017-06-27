/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Criatura;
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
public class CriaturaHandler extends CardConnectionHandler {

    @Override
    public List<String> handleAdd(Carta card) throws SQLException {
        if (Criatura.class == card.getClass()) {
            String prepStatCard = prepareCardStatement(card);
            String prepStatCrit = (""
                    + "INSERT INTO cartacriatura VALUES"
                    + "(default, "
                    + ((Criatura)card).getResistencia()+ ", "
                    + ((Criatura)card).getAtaque()+ ", "
                    + card.getId()
                    + ")"
            );
            ArrayList<String> lista = new ArrayList<>();
            lista.add(prepStatCard);
            lista.add(prepStatCrit);
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
        if (Criatura.class == card.getClass()) {
            List<String> lista = new ArrayList<>();
            return lista;
        } else {
            return successor.handleAdd(card);
        }
    }
}