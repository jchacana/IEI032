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
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mikka
 */
public abstract class ConnectionDatabase{

    private static Connection con;
    
    private static boolean connect() {
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

    public static boolean closeConnection() {
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

    
    public static Connection getConnection(){
        connect();
        return con;
    }
}
