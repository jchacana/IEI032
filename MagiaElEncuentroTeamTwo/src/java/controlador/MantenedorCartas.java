
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carta;
import persistencia.Conexion;

/**
 *
 * @author Cristóbal
 */
public class MantenedorCartas extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionBoton = request.getParameter("BtnAccion");
        Conexion conexion = new Conexion();
        if(accionBoton.equals("Agregar Carta")){
            int id = Integer.parseInt(request.getParameter("idCarta"));
            String nombre = request.getParameter("nombreCarta");
            int costo = Integer.parseInt(request.getParameter("costoCarta"));
            String descripcion = request.getParameter("descripcionCarta");
            conexion.agregarCarta(new Carta(id,nombre,costo,descripcion));
            response.sendRedirect("agregarCartas.jsp");
        }
        if(accionBoton.equals("Actualizar Carta")){
            int id = Integer.parseInt(request.getParameter("idCarta"));
            String nombre = request.getParameter("nombreCarta");
            int costo = Integer.parseInt(request.getParameter("costoCarta"));
            String descripcion = request.getParameter("descripcionCarta");
            String estado = request.getParameter("estado");
            conexion.actualizarCarta(new Carta(id,nombre,costo,descripcion),estado);
            response.sendRedirect("actualizarCartas.jsp");
        }
        if(accionBoton.equals("Eliminar Carta")){
            int id = Integer.parseInt(request.getParameter("idCarta"));
            String nombre = request.getParameter("nombreCarta");
            int costo = Integer.parseInt(request.getParameter("costoCarta"));
            String descripcion = request.getParameter("descripcionCarta");
            conexion.eliminarCarta(new Carta(id,nombre,costo,descripcion));
            response.sendRedirect("eliminarCarta.jsp");
        }
    }
}
