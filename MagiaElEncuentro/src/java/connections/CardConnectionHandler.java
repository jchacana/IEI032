/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mikka
 */
public abstract class CardConnectionHandler {

    protected CardConnectionHandler successor;

    public void setSuccessor(CardConnectionHandler successor) {
        this.successor = successor;
    }

    public abstract List<String> handleAdd(Carta card) throws SQLException;

    public abstract List<String> handleModify(Carta card) throws SQLException;

    protected String prepareCardStatement(Carta card) {
        String prepStatCard = "INSERT INTO carta VALUES"
                + "("
                + "default, "
                + card.getCosto() + ", \""
                + card.getNombre() + "\", \""
                + card.getDescripcion() + "\", \""
                + card.getIlustrador() + "\", \""
                + card.getEdicion() + "\", "
                + card.isDisponible()
                + ")";
        return prepStatCard;
    }

}
