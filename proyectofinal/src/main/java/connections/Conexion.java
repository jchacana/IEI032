/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mauri
 */
public class Conexion {
     private Connection conexion;
     public static int numero = 1;
     private int id = numero ++;
    public Conexion()
    {
        establecerConexion();
    }
    private void establecerConexion(){
        try
        {
            // establecemos Driver
            Class.forName("com.mysql.jdbc.Driver");
            //creamos la conexion a la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/magia?zeroDateTimeBehavior=convertToNull", "root", "");
        }
        catch(SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            
        }
        
    }
     public boolean agregarUsuario(String nombre, String pass, String correo)
    {
        
        
        boolean resultado = false;
        try
        {
            
            //DEFINIMOS EL OBJETO QUE PERMITIRA EJECUTAR SENTENCIAS SQL A LA BASE DE DATOS
            Statement sentencia = conexion.createStatement();
            
            
            int fila = sentencia.executeUpdate("insert into usuario values('"+id+"','"+nombre+"' ,'"+pass+"','"+correo+"' ) ");
            if(fila == 1)
            {
                resultado = true;
                System.out.println(resultado);
            }
       }
       catch(SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean consultaUsuario(String user , String password){
        boolean resultado = false;
        try{
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from usuario where nombre = '"+user+"' and pass = '"+password+"'");
            while(rs.next())
            {
                resultado = true;
            }
        }
            catch(SQLException ex)
                    {
                    System.out.println("error: " + ex.getMessage());
                    }
            return resultado;
        }
    
    
    
    
}
