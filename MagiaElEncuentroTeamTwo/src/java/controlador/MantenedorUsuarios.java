
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import persistencia.Conexion;

/**
 *
 * @author Cristóbal
 */
public class MantenedorUsuarios extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionBoton = request.getParameter("btnAccion");
        Conexion conexion = new Conexion();
        if(accionBoton.equals("Agregar Usuario")){
            int idUser = conexion.numeroSiguienteUsuario();
            String nombreUsuario = request.getParameter("nombreUsuario");
            String password = request.getParameter("password");
            String cuentaUsuario = (nombreUsuario+","+password);
            ArrayList<String> cuentas = conexion.obtenerCuentaUsuarios();
            if(!cuentas.contains(cuentaUsuario)){
                if(conexion.agregarUsuario(new Usuario(idUser, nombreUsuario, password))){
                    Cookie miCookie = new Cookie("usuario",nombreUsuario);
                    miCookie.setMaxAge(60*30);
                    response.addCookie(miCookie);
                    HttpSession miSession = request.getSession(true);
                    miSession.setAttribute("usuario",nombreUsuario);
                    response.sendRedirect("index.jsp");
                }
                else{
                    //alert cpn javascript del problema
                    response.sendRedirect("registroUsuario.jsp");
                }
            }
            else{
                //alert cpn javascript del problema
                response.sendRedirect("registroUsuario.jsp");
            }
        }
        if(accionBoton.equals("Actualizar Datos")){
            int idUser = conexion.numeroSiguienteUsuario();
            String nombreUsuario = request.getParameter("nombreUsuario");
            String password = request.getParameter("password");
            String cuentaUsuario = (nombreUsuario+","+password);
            ArrayList<String> cuentas = conexion.obtenerCuentaUsuarios();
        }
        
    }

}
