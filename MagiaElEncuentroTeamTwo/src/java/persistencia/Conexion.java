
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Carta;
import modelo.Usuario;
//import modelo.Mazo;
/**
 *
 * @author Cristóbal
 */
public class Conexion {
    private Connection conexion;
    private  ArrayList<Usuario> usuariosDisponibles = new ArrayList<>();
    //private  ArrayList<Mazo> mazosDisponibles = new ArrayList<>();
    private ArrayList<Integer> idCartas = new ArrayList<>();
    
    public Conexion()
    {
        establecerConexion();
    }
    
    private void establecerConexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/magia?zeroDateTimeBehavior=convertToNull", "root", "");
        }
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println("error: " + ex.getMessage());
        }
    }
    
    public int numeroCarta(){
        int ultimoNumeroCarta = 0;
        try
        {
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT max(id)numero from carta");
            while(rs.next())
            {
                ultimoNumeroCarta = rs.getInt("numero");
            }
        }
        catch(SQLException ex)
        {
            System.out.println("error: " + ex.getMessage());
            ultimoNumeroCarta = -1;
        }
        return ultimoNumeroCarta;
    }
    
    public boolean cartasDisponibles()
    {
        boolean resultado = false;
        try
        {
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * from carta");
            while(rs.next())
            {
                if(rs.getString("estado").equals("V")){
                    idCartas.add(rs.getInt("id"));
                }
            }
        }
        catch(SQLException ex)
        {
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean agregarCarta(Carta carta)
    {
        cartasDisponibles();
        boolean resultado = false;
        try
        {
            if(!idCartas.contains(carta.getId())){
                Statement sentencia = conexion.createStatement();
                int fila = sentencia.executeUpdate("INSERT INTO carta VALUES('"+carta.getId()+"','"+carta.getNombre()+"','"+carta.getCosto()+"','"+carta.getDescripcion()+"')");
                if(fila == 1)
                {
                    resultado = true;
                }
            }
        }
        catch(SQLException ex)
        {
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public boolean actualizarCarta(Carta carta,String estado){
        boolean modificacion = false;
        establecerConexion();
        try{
            Statement sentencia = conexion.createStatement();
            String query ="UPDATE carta SET nombre = ?,costo = ?,descripcion = ?,estado = ? where id =='"+carta.getId()+"'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1,carta.getNombre());
            ps.setInt(2,carta.getCosto());
            ps.setString(3,carta.getDescripcion());
            ps.setString(4,estado);
            int filas = ps.executeUpdate();
            if(filas >0){
                modificacion = true;
            }
        }
        catch(Exception ex){
           System.out.println(ex); 
        }
        return modificacion;
    }
    
    public boolean eliminarCarta(Carta carta){
        boolean resultado = false;
        establecerConexion();
        cartasDisponibles();
        if(idCartas.contains(carta.getId())){
            try{
                Statement sentencia = conexion.createStatement();
                String query ="UPDATE usuario SET vigente = ? where nombreUsuario =='"+carta.getNombre()+"' and estado = V ";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1,"N");
                int filas = ps.executeUpdate();
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
    
    public Usuario usuarioEnUso(String usuario){
        establecerConexion();
        Usuario usuarioEnAccion = null;
        try{
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("select * from usuario where nombreUsuario ='"+usuario+"' ");
            while(rs.next()){
                if(rs.getString("estado").equals("V")){
                    usuarioEnAccion = new Usuario(rs.getInt("idUser"),rs.getString("nombreUsuario"),rs.getString("password"));
                }
            }
        }
        catch(SQLException ex){
            System.out.print(ex);   
        }
        return usuarioEnAccion;
    }
    
    public ArrayList<String> obtenerCuentaUsuarios(){
        establecerConexion();
        ArrayList<String> cuentas = new ArrayList<>();
        try{
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("select * from usuario");
            while(rs.next()){
                if(rs.getString("estado").equals("V")){
                    cuentas.add(rs.getString("nombreUsuario")+","+rs.getString("password"));
                }
            }
        }
        catch(SQLException ex){
            System.out.print(ex);   
        }
        return cuentas;
    }
    public void obtenerUsuarios(){
        establecerConexion();
        try{
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("select * from usuario");
            while(rs.next()){
                if(rs.getString("estado").equals("V")){
                    usuariosDisponibles.add(new Usuario(rs.getInt("idUser"),rs.getString("nombreUsuario"),rs.getString("password")));
                }
            }
        }
        catch(SQLException ex){
            
            System.out.print(ex);   
        }
    }
    
    public  int numeroSiguienteUsuario(){
        establecerConexion();
        int id = 0;
        try{
            Statement stm= conexion.createStatement();
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
    
    public boolean agregarUsuario(Usuario usuario){
        
        boolean resultado = false;
        establecerConexion();
        obtenerUsuarios();
        try{
            Statement sentencia = conexion.createStatement();
                int fila = sentencia.executeUpdate("INSERT INTO usuario VALUES ('"+usuario.getId()+"','"+usuario.getNombreUsuario()+"','"+usuario.getPassword()+"', 'V' )");
                if(fila ==1){
                    resultado = true;
                }
        }
        catch(SQLException ex){
            System.out.println("error: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean actualizarUsuario(Usuario usuario,String estado){
        establecerConexion();
        boolean modificacion = true;
        try{
            Statement sentencia = conexion.createStatement();
            String query ="UPDATE mazo SET password = ? where nombreUsuario =='"+usuario.getNombreUsuario()+"'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1,usuario.getPassword());
            int filas = ps.executeUpdate();
            if(filas >0){
                modificacion = true;
            }
        }
        catch(Exception ex){
           System.out.println(ex); 
        }
        return modificacion;   
    }
    
    public boolean eliminarUsuario(Usuario usuario){
        boolean resultado = false;
        establecerConexion();
        obtenerUsuarios();
        if(usuariosDisponibles.contains(usuario)){
            try{
                Statement sentencia = conexion.createStatement();
                String query ="UPDATE usuario SET vigente = ? where nombreUsuario =='"+usuario.getNombreUsuario()+"'";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1,"n");
                int filas = ps.executeUpdate();
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
