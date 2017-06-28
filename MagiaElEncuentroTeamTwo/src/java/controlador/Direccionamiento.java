
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Conexion;

/**
 *
 * @author Cristóbal
 */
public class Direccionamiento extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionBoton = request.getParameter("btnAccion");
        Conexion conexion = new Conexion();
        if(accionBoton.equals("Ingresar")){
            ArrayList<String> cuentas = conexion.obtenerCuentaUsuarios();
            String nombreUsuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            String cuenta = nombreUsuario+","+password;
            if(cuentas.contains(cuenta)){
                response.sendRedirect("home.jsp");
                
            }
            else{
                response.sendRedirect("index.jsp");
            }
        }
        if(accionBoton.equals("Registrar")){
            response.sendRedirect("registroUsuario.jsp");
        }
    }

}
