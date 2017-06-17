/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import baseDeDatos.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carta;
import modelo.Usuario;

/**
 *
 * @author Dzerinop
 */
public class AgregarCartas extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionBoton = request.getParameter("accionBoton");
        if(accionBoton.equals("Ingresar Cartas")){
            int id = Integer.parseInt(request.getParameter("idCarta"));
            String nombre = request.getParameter("nombreCarta");
            int costo = Integer.parseInt(request.getParameter("costoCarta"));
            String descripcion = request.getParameter("descripcion");
            
            Conexion conexion = new Conexion();
            if (conexion.consultarCarta(id) == false) {
                conexion.agregarCarta(new Carta(id,nombre,costo,descripcion));
                response.sendRedirect("index.jsp");
            }
            else {
                response.sendRedirect("index.jsp");
            }
        }
        /*if(accionBoton.equals("Agregar Usuario")){
            String nombre = request.getParameter("nombreUsuario");
            String password = request.getParameter("password");
            Conexion conexion = new Conexion();
            conexion.agregarUsuario(new Usuario(nombre,password));
            response.sendRedirect("mantenedorAgregar.jsp");
        }*/
    
    }
}
