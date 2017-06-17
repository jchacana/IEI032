/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Carta;
import modelo.Usuario;

/**
 *
 * @author Dzerinop
 */
public class Conexion {
     private Connection conexion;
     private static ArrayList<Usuario> usuariosDisponibles = new ArrayList<>();
    
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
    public boolean agregarCarta(Carta carta)
    {
        boolean resultado = false;
        try
        {
            Statement sentencia = conexion.createStatement();
            int fila = sentencia.executeUpdate("INSERT INTO carta VALUES('"+carta.getId()+"','"+carta.getNombre()+"','"+carta.getCosto()+"','"+carta.getDescripcion()+"')");
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
    
    public void obtenerUsuarios(){
        establecerConexion();
        try{
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("select * from usuario");
            while(rs.next()){
                usuariosDisponibles.add(new Usuario(rs.getInt("id"),rs.getString("nombreUsuario"),rs.getString("password")));
            }
        }
        catch(SQLException ex){
            
            System.out.print(ex);   
        }
    }
    
    public boolean agregarUsuario(Usuario usuario){
        
        boolean resultado = false;
        establecerConexion();
        obtenerUsuarios();
        try{
            Statement sentencia = conexion.createStatement();
            if(!usuariosDisponibles.contains(usuario)){
                int fila = sentencia.executeUpdate("INSERT INTO usuario VALUES ('"+usuario.getNombreUsuario()+"','"+usuario.getPassword()+"')");
                if(fila ==1){
                    resultado = true;
                }
            }
            else{
                resultado = false;
            }
        }
        catch(SQLException ex){
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean eliminarUsuario(Usuario usuario){
        boolean resultado = false;
        establecerConexion();
        obtenerUsuarios();
        if(usuariosDisponibles.contains(usuario)){
            try{
                Statement sentencia = conexion.createStatement();
                String query ="UPDATE usuario SET vigente = ? where nombreUsuario =='"+usuario.getNombreUsuario()+"'";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1,"n");
                int filas = ps.executeUpdate();
                if(filas >0){
                    resultado = true;
                }
            }
            catch(Exception ex){
               System.out.println(ex); 
               resultado = false;
            }
        }
        return resultado;
    }
    
    public boolean actualizarUsuario(Usuario usuario){
        establecerConexion();
        boolean modificacion = true;
        try{
            Statement sentencia = conexion.createStatement();
            String query ="UPDATE mazo SET password = ? where nombreUsuario =='"+usuario.getNombreUsuario()+"'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1,usuario.getPassword());
            int filas = ps.executeUpdate();
            if(filas >0){
                modificacion = true;
            }
        }
        catch(Exception ex){
           System.out.println(ex); 
        }
        return modificacion;   
    }
    
    
    
}
