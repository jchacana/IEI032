
package modelo;

/**
 *
 * @author Cristóbal
 */
public class Usuario {
    private int id;
    private String nombreUsuario;
    private String password;
    
    public Usuario(int id,String nombreUsuario,String password){
        setId(id);
        setNombreUsuario(nombreUsuario);
        setPassword(password);
    }

    
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
