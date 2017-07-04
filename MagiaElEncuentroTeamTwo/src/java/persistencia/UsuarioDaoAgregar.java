
package persistencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Usuario;
/**
 *
 * @author Cristóbal
 */
public class UsuarioDaoAgregar { 
    private Conexion conexion = new Conexion();
    
    
    public ArrayList<String> obtenerCuentaUsuario(){
        ArrayList<String> usuarios = new ArrayList<>();
        
        try{
            Statement stm = conexion.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select nombreUsuario from usuario where vigente = 'S' or vigente = 'N' ");
            while(rs.next()){
                usuarios.add(rs.getString("nombreUsuario"));
            }
        }
        catch(Exception ex){
            System.out.print(ex);   
        }
        return usuarios;
    }
    
    public boolean agregarUsuario(Usuario user){
        boolean resultado = false;
        ArrayList<String> usuarios = obtenerCuentaUsuario();
        if(!(usuarios.contains(user.getNombreUsuario()))){
            try{
                String query = ("INSERT INTO usuario (idUser,nombreUsuario,password,correo,vigente) VALUES (?,?,?,?,?)");
                PreparedStatement pst =  conexion.getConnection().prepareStatement(query);
                pst.setInt(1,user.getId());
                pst.setString(2,user.getNombreUsuario());
                pst.setString(3,user.getPassword());    
                pst.setString(4,user.getCorreo());
                pst.setString(5,"S");
                int filas = pst.executeUpdate();
                if(filas >0){
                    resultado = true;
                }
            }
            catch(SQLException ex){
                System.out.println("error: " + ex.getMessage());
            }
        }
        return resultado;
    }
    
    public  int numeroSiguienteUsuario(){
        int id = 0;
        try{
            Statement stm= conexion.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select max(idUser)numeroUser from usuario");
            while(rs.next()){
                id = rs.getInt("numeroUser") +1;
            }
        }
        catch(SQLException ex){
            System.out.print(ex);   
        }
        return id;
    }
}