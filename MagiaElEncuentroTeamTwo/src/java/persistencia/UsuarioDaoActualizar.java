
package persistencia;

import java.sql.PreparedStatement;
import modelo.Usuario;

/**
 *
 * @author Cristóbal
 */
public class UsuarioDaoActualizar {
    private Conexion conexion = new Conexion();
    
    public boolean actualizarUsuario(Usuario usuario){
        boolean modificacion = true;
        try{
            String query ="UPDATE mazo SET password = ?,correo = ? where nombreUsuario =='"+usuario.getNombreUsuario()+"'";
            PreparedStatement pst = conexion.getConnection().prepareStatement(query);
            pst.setString(1,usuario.getPassword());
            pst.setString(2,usuario.getCorreo());
            int filas = pst.executeUpdate();
            if(filas >0){
                modificacion = true;
            }
        }
        catch(Exception ex){
           System.out.println(ex); 
        }
        return modificacion;   
    }
}