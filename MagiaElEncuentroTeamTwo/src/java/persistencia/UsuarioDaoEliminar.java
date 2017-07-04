
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author Cristóbal
 */
public class UsuarioDaoEliminar {
    private Conexion conexion = new Conexion();
            
    public ArrayList<String> obtenerCuentaUsuario(){
        ArrayList<String> usuarios = new ArrayList<>();
        try{
            Statement stm = conexion.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from usuario where vigente = 'S' ");
            while(rs.next()){
                usuarios.add(rs.getString("nombreUsuario")+rs.getString("password"));
            }
        }
        catch(Exception ex){
            usuarios = null;
            System.out.print(ex);   
        }
        return usuarios;
    }
    
    public boolean eliminarUsuario(Usuario usuario){
        boolean resultado = false;
        ArrayList<String> usuarios = obtenerCuentaUsuario();
        if(usuarios.contains(usuario.getNombreUsuario() + usuario.getPassword())){
            try{
                String query ="UPDATE usuario SET vigente = ? where nombreUsuario = ?";
                PreparedStatement pst = conexion.getConnection().prepareStatement(query);
                pst.setString(1,"N");
                pst.setString(2,usuario.getNombreUsuario());
                int filas = pst.executeUpdate();
                if(filas >0){
                    resultado = true;
                }
            }
            catch(Exception ex){
               System.out.println(ex); 
               resultado = false;
            }
        }
        return resultado;
    }
}