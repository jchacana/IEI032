
package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Cristóbal
 */
public class ControlSession {
    Conexion conexion = new Conexion();
    
    public ArrayList<String> obtenerCuentaUsuario(){
        ArrayList<String> usuarios = new ArrayList<>();
        try{
            Statement stm = conexion.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select nombreUsuario,password from usuario where vigente = 'S' ");
            while(rs.next()){
                usuarios.add(rs.getString("nombreUsuario")+rs.getString("password"));
            }
        }
        catch(Exception ex){
            System.out.print(ex);   
        }
        return usuarios;
    }
    public boolean cuentaUsuarioExistente(String cuentaUsuario){
       boolean existe = false;
       ArrayList<String> usuarios = obtenerCuentaUsuario();
       if(usuarios.contains(cuentaUsuario)){
           existe = true;
       }
       return existe;
    }
}