/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import connections.ConnectionDatabase;
import connections.UsuarioConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

//REVISAR ERROR 500 
/**
 *
 * @author Mauri
 */
public class RegistroUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private ConnectionDatabase con;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String user = request.getParameter("user");
            String password = request.getParameter("pwd");
            String correo = request.getParameter("corr");
            UsuarioConnection conexion = new UsuarioConnection();
            if (conexion.agregarUsuario(user, password, correo) == true) {
                response.sendRedirect("index.html");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
                PrintWriter ou = response.getWriter();
                ou.println("<font> EXITO </font>");
                rd.include(request, response);
            } else {
                response.sendRedirect("registro.jsp");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        //else
        //{
        //    RequestDispatcher rq = getServletContext().getRequestDispatcher("/index.html");
        //retorna la url donde esta el servlet
        //    PrintWriter o = response.getWriter();
        //   o.println("<font color = red> Servlets De Registro !</font> ");
        // rq.include(request, response);
        // }
    }

}
