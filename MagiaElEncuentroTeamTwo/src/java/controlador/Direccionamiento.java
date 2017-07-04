
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        String accionBoton = request.getParameter("btnAccion");
        DataBaseEntry dataBaseEntry = new DataBaseEntry();
        if(accionBoton.equals("Ingresar")){
           String nombre = request.getParameter("usuario");
           String password = request.getParameter("password");
           String cuenta = nombre+password;
           if(dataBaseEntry.validarSessionUsuario(cuenta)){
               
               
           }
        }
        if(accionBoton.equals("Registrar")){
            response.sendRedirect("registroUsuario.jsp");
        }
        if(accionBoton.equals("Registrarse")){
            
            int id = dataBaseEntry.idUsuario();
            String nombre = request.getParameter("nombreUser");
            String password = request.getParameter("password");
            String correo = request.getParameter("correo");
            if(dataBaseEntry.insertaUsuario(new Usuario(id,nombre,password,correo))){
                response.sendRedirect("index.jsp");
            }
            else{
                PrintWriter out = response.getWriter();
                out.println("<h1>no agrega</h1>");
            }
        }
    }

}
