
package controlador;

import baseDeDatos.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author Cristóbal
 */
public class MantenedoresUsuario extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionBoton = request.getParameter("boton");
        Conexion conexion = new Conexion();
        if(accionBoton.equals("agregarUsuario")){
            int idUsuario = Integer.parseInt(request.getParameter("idUser"));
            String nombre = request.getParameter("nombreUsuario");
            String password = request.getParameter("password");
            conexion.agregarUsuario(new Usuario(idUsuario,nombre,password));
            response.sendRedirect("mantenedorAgregar.jsp");
        }
        if(accionBoton.equals("eliminarUsuario")){
            int idUsuario =  Integer.parseInt(request.getParameter("idUser"));
            String nombreUsuario = request.getParameter("nombreUsuario");
            String password = request.getParameter("pass");
            conexion.eliminarUsuario(new Usuario(idUsuario,nombreUsuario,password));
            response.sendRedirect("mantenedorEliminar.jsp");
        }
        if(accionBoton.equals("actualizarUsuario")){
            int idUsuario = Integer.parseInt(request.getParameter("idUser"));
            String nombreUsuario = request.getParameter("nombreUsuario");
            String password = request.getParameter("pass");
            conexion.eliminarUsuario(new Usuario(idUsuario,nombreUsuario,password));
            response.sendRedirect("mantenedorActualizar.jsp");
        }
        
    }

}
