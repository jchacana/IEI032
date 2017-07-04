
package persistencia;

import modelo.Usuario;

/**
 *
 * @author Cristóbal
 */
public class DataBaseEntry {
    UsuarioDaoAgregar usuarioDaoAgregar = new UsuarioDaoAgregar();
    UsuarioDaoActualizar usuarioDaoActualizar = new UsuarioDaoActualizar();
    UsuarioDaoEliminar usuarioDaoEliminar = new UsuarioDaoEliminar();
    ControlSession controlSession = new ControlSession();
    
    
    
    public boolean insertaUsuario(Usuario user){
        return usuarioDaoAgregar.agregarUsuario(user);
    }
    public boolean actualizarUsuario(Usuario usuarioUpdate){
        return usuarioDaoActualizar.actualizarUsuario(usuarioUpdate);
    }
    public boolean eliminarUsuario(Usuario usuarioDelete){
        return usuarioDaoEliminar.eliminarUsuario(usuarioDelete);
    }
    public boolean validarSessionUsuario(String CuentaUsuario){
        return controlSession.cuentaUsuarioExistente(CuentaUsuario);
    }
    
    //preguntar si esta bien o mal pero ya se la respuesta !! :)
    public int idUsuario(){
        return usuarioDaoAgregar.numeroSiguienteUsuario();
    }
}
