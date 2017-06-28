/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mikka
 */
public class UsuarioConnection extends ConnectionDatabase {

    public boolean agregarUsuario(String nombre, String pass, String correo) throws SQLException {
        boolean resultado = false;
        Connection con = getConnection();
        //DEFINIMOS EL OBJETO QUE PERMITIRA EJECUTAR SENTENCIAS SQL A LA BASE DE DATOS
        Statement sentencia = con.createStatement();
        if (!consultaUsuario(nombre, correo)) {
            int fila = sentencia.executeUpdate("insert into usuario values(default,'" + nombre + "' ,'" + pass + "','" + correo + "' ) ");
            if (fila == 1) {
                resultado = true;
                System.out.println(resultado);
            }
        }
        return resultado;
    }

    public boolean consultaUsuario(String user, String correo) {
        boolean resultado = false;
        try {
            Connection con = getConnection();
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from usuario where nombre = '" + user + "' and correo = '" + correo + "'");
            while (rs.next()) {
                resultado = true;
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean verificarDatos(String user, String password) {
        boolean resultado = false;
        try {
            Connection con = getConnection();
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from usuario where nombre = '" + user + "' and password = '" + password + "'");
            while (rs.next()) {
                resultado = true;
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        return resultado;
    }

}
