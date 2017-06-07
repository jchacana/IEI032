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

/**
 *
 * @author migue
 */
public abstract class ConnectionHandler {

    protected ConnectionHandler successor;

    public void setSuccessor(ConnectionHandler successor) {
        this.successor = successor;
    }

    public abstract void handleAdd(Carta card, Connection con) throws SQLException;

    public abstract void handleModify(Carta card, Connection con) throws SQLException;

    public String prepareCardStatement(Carta card) {
        String prepStatCard = "INSERT INTO carta VALUES"
                + "("
                + card.getId() + ", "
                + card.getCosto() + ", \""
                + card.getNombre() + "\", \""
                + card.getDescripcion() + "\", \""
                + card.getIlustrador() + "\", \""
                + card.getEdicion() + "\", \""
                + ")";
        return prepStatCard;
    }

}
