/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Conjuro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mikka
 */
public class ConnectionDatabase implements interfaces.repository {

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
    
    private ConnectionHandler setHandlers(){
        ConnectionHandler h1 = new ConjuroHandler();
        return h1;
    }
    
    @Override
    public boolean add(Carta carta) {
        connect();
        closeConnection();
        return true;
        
    }
    
    @Override
    public boolean modify(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
