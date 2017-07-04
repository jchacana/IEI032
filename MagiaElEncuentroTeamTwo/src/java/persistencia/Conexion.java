
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import modelo.Mazo;
/**
 *
 * @author Cristóbal
 */
public class Conexion {
    private Connection conexion;
   
    public Conexion(){
        establecerConexion();
    }
    
    public void establecerConexion()
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
    
    public Connection getConnection(){
      return conexion;
    }
    public void desconectar(){
      conexion = null;
    }
}
