/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import connections.UsuarioConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mauri
 */
public class LoginUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginUsuario at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        String user = request.getParameter("user");
        String password = request.getParameter("pwd");
        UsuarioConnection conexion = new UsuarioConnection();
        if (conexion.verificarDatos(user, password) == true) {
            // creacion de la sesion para el usuario
            HttpSession session = request.getSession();
            session.setAttribute("usuario", user);
            session.setMaxInactiveInterval(30 * 60);//30 minutos 
            Cookie nombreCookie = new Cookie("usuario", user);
            nombreCookie.setMaxAge(30 * 60);
            response.addCookie(nombreCookie);
            //   response.sendRedirect("./index.html");
            //obtener la url codificada 
            String urlCoo = response.encodeRedirectURL("LoginExitoso");
            response.sendRedirect(urlCoo);
            // PrintWriter o = response.getWriter();
            //o.println("<font color = red> Usuario o password CORRECTOS !</font> ");
        } else {
            RequestDispatcher rq = getServletContext().getRequestDispatcher("/index.html");
            //retorna la url donde esta el servlet
            PrintWriter o = response.getWriter();
            o.println("<font color = red> Usuario o password incorrectos !</font> ");
            rq.include(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
