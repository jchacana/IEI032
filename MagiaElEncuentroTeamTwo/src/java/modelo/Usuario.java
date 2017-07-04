
package modelo;

/**
 *
 * @author Cristóbal
 */
public class Usuario {
    private int id;
    private String nombreUsuario;
    private String password;
    private String correo;
    
    public Usuario(int id,String nombreUsuario,String password,String correo){
        setId(id);
        setNombreUsuario(nombreUsuario);
        setPassword(password);
        setCorreo(correo);
    }

    
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }
    public String getCorreo(){
        return correo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
