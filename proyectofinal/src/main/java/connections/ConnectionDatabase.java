/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author mikka
 */
public class ConnectionDatabase implements interfaces.Repository{

    private Connection con;
    
    private boolean connect() {
        try {
            System.out.println("Trying to connect...");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magia?zeroDateTimeBehavior=convertToNull", "mikka", "123");
            System.out.println("Connected! ");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error trying to connect ");
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
        
    }

    private boolean closeConnection() {
        try {
            System.out.println("Closing connection...");
            con.close();
            System.out.println("Connection closed");
            return true;
        } catch (SQLException ex) {
            System.out.println("Error trying to close connection");
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    
    public Connection getConnection(){
        return con;
    }
    
    private CardConnectionHandler setHandlers(){
        CardConnectionHandler h1 = new ConjuroHandler();
        CardConnectionHandler h2 = new ConjuroHandler();
        CardConnectionHandler h3 = new ConjuroHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        return h1;
    }
    
    @Override
    public boolean addCarta(Carta carta) {
        connect();
        try {
            List<PreparedStatement> prList = setHandlers().handleAdd(carta, getConnection());
            if(prList.get(0).execute() && prList.get(1).execute()){
                closeConnection();
                return true;
            }
            return false;
            
        } catch (SQLException e) {
            closeConnection();
            System.out.println("Error:" + e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean modifyCarta(Carta carta) {
        connect();
        try {
            List<PreparedStatement> prList = setHandlers().handleModify(carta, getConnection());
            if(prList.get(0).execute() && prList.get(1).execute()){
                closeConnection();
                return true;
            }
            return false;
            
        } catch (SQLException e) {
            closeConnection();
            System.out.println("Error:" + e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean deleteCarta(int id) {
        connect();
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
   
    @Override
    public boolean addCollection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifyCollection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCollection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
