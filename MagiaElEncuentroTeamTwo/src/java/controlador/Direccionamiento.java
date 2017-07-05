package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import persistencia.DataBaseEntry;

/**
 *
 * @author Cristóbal
 */
public class Direccionamiento extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String accionBoton = request.getParameter("btnAccion");
        DataBaseEntry dataBaseEntry = new DataBaseEntry();
        if (accionBoton.equals("Ingresar")) {
            HttpSession sesion = request.getSession();
            String nombre = request.getParameter("usuario");
            String password = request.getParameter("password");
            String cuenta = nombre + password;
            if (dataBaseEntry.validarSessionUsuario(cuenta)) {
                if (nombre.equals("admin") && sesion != null) {
                    sesion.setAttribute("admin", nombre);
                    Cookie cookie = new Cookie("admin", nombre);
                    cookie.setMaxAge(60 * 60 * 24);
                    response.addCookie(cookie);
                    response.sendRedirect("home.jsp");
                } else {
                    if (!nombre.equals("admin")) {
                        sesion.setAttribute("usuario", nombre);
                        Cookie cookie = new Cookie("usuario", nombre);
                        cookie.setMaxAge(60*60*24);
                        response.addCookie(cookie);
                        response.sendRedirect("home.jsp");
                    }
                }
            }
        }
        if (accionBoton.equals("Registrar")) {
            response.sendRedirect("registroUsuario.jsp");
        }
        if (accionBoton.equals("Registrarse")) {

            int id = dataBaseEntry.idUsuario();
            String nombre = request.getParameter("nombreUser");
            String password = request.getParameter("password");
            String correo = request.getParameter("correo");
            if (dataBaseEntry.insertaUsuario(new Usuario(id, nombre, password, correo))) {
                response.sendRedirect("index.jsp");
            } else {

                out.println("<h1>no agrega</h1>");
            }
        }
    }

}
