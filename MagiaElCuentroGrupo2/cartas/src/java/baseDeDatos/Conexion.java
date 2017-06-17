/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dzerinop
 */
public class Conexion {
     private Connection conexion;
    
    public Conexion()
    {
        establecerConexion();
    }
    
    private void establecerConexion()
    {
        try
        {
            //establecemos Driver
            Class.forName("com.mysql.jdbc.Driver");
            //creamos la conexion a la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartas?zeroDateTimeBehavior=convertToNull", "root", "");
        }
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println("error: " + ex.getMessage());
        }
    }
    
     public boolean consultarCarta(int id)
    {
        boolean resultado = false;
        try
        {
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * from carta where id ='"+id+"'");
            while(rs.next())
            {
                resultado = true;
            }
        }
        catch(SQLException ex)
        {
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public boolean agregarCarta(int id, String nombre, String descripcion)
    {
        boolean resultado = false;
        try
        {
            Statement sentencia = conexion.createStatement();
            int fila = sentencia.executeUpdate("INSERT INTO carta VALUES('"+id+"','"+nombre+"','"+descripcion+"')");
            if(fila == 1)
            {
                resultado = true;
            }
        }
        catch(SQLException ex)
        {
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }

    
}
