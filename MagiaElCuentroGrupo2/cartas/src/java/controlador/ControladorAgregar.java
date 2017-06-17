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

/**
 *
 * @author Dzerinop
 */
public class ControladorAgregar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String id = request.getParameter("idProducto");
       String nombre = request.getParameter("nombreCarta");
       String descripcion = request.getParameter("descripcion");
       
       Conexion conexion = new Conexion();
        if (conexion.consultarCarta(Integer.parseInt(id)) == false) {
            conexion.agregarCarta(Integer.parseInt(id),nombre, descripcion);
            response.sendRedirect("index.jsp");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/AgregarProducto");
            PrintWriter out = response.getWriter();
            out.println("<font >Usuario registrado con exito</font>");
            rd.include(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
