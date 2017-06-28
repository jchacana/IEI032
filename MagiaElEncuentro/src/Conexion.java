/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import forms.FormBeanProducto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Soporte
 */
public class Conexion {

    private static Connection con = generarConexion();
    private static String query;
    private static ResultSet rs;
    private static PreparedStatement ps;

    public static Connection generarConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/keep-it?zeroDateTimeBehavior=convertToNull", "Mori", "1234");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static ArrayList<FormBeanProducto> getArrayProductos(){
        try {
            query = "SELECT * FROM tipo_cliente where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<FormBeanProducto> array = new ArrayList<>();
            while (rs.next()) {
                FormBeanProducto fbp = new FormBeanProducto();
                fbp.setBodega(rs.getInt("id_bodega")+"");
                fbp.setCantidad(rs.getInt("id_bodega"));
                fbp.setDescripcion(rs.getString("descripcion"));
                fbp.setTipoProducto(""+rs.getInt("id_tipo_producto"));
                fbp.setValor(rs.getDouble("valor"));
                array.add(fbp);
            }
            return array;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
    public static void closeConnections() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (query != null) {
                query = null;
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return validacion;
    }

    /**
     *
     * @param rut
     * @return null Si No Existe || String = [ID CLIENTE, RAZON SOCIAL CLIENTE,
     * DESCRIPCION TIPO DE CLIENTE] es
     */
    public static String[] existeCliente(String rut) {
        try {
            if (validarRut(rut)) {
                StringTokenizer st = new StringTokenizer(rut, "-");
                String rt = st.nextToken();
                String dv = st.nextToken();
                query = "SELECT c.id as id, c.razon_social as nombre, tc.descripcion as tipo FROM cliente c, tipo_cliente tc where c.habilitado = 1 and tc.habilitado = 1 and c.id_tipo_cliente = tc.id and c.rut = " + rt + " and c.dv = " + dv;
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                String[] cliente = new String[3];
                if (rs.next()) {
                    cliente[0] = rs.getString("id");
                    cliente[1] = rs.getString("nombre");
                    cliente[2] = rs.getString("tipo");
                    return cliente;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    public static int getIdTipoCliente(String nombre) {
        try {
            query = "SELECT * FROM tipo_cliente where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            int valor = -1;
            while (rs.next()) {
                if (rs.getString("descripcion").equalsIgnoreCase(nombre)) {
                    return rs.getInt("id");
                }
            }
            return valor;
        } catch (Exception e) {
            System.err.println(e);
            return -1;
        }
    }

    public static int getIdTipo(String nombre) {
        try {
            query = "SELECT * FROM tipo_producto where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            int valor = -1;
            while (rs.next()) {
                if (rs.getString("descripcion").equalsIgnoreCase(nombre)) {
                    return rs.getInt("id");
                }
            }
            return valor;
        } catch (Exception e) {
            System.err.println(e);
            return -1;
        }
    }

    public static int getIdBodega(String nombre) {
        try {
            query = "SELECT * FROM bodega where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("nombre").equalsIgnoreCase(nombre)) {
                    return rs.getInt("id");
                }
            }
            return -1;
        } catch (Exception e) {
            System.err.println(e);
            return -1;
        }
    }

    public static boolean insertProducto(String descripcion, int cantidad, double valor, String tipoProducto, String bodega) {
        try {
            System.err.println(getIdBodega(bodega) + "||" + getIdTipo(tipoProducto));
            if (getIdBodega(bodega) > 0 && getIdTipo(tipoProducto) > 0) {
                query = "INSERT INTO producto VALUES(default, '" + descripcion + "', " + cantidad + ", " + valor + ", 1, " + getIdBodega(bodega) + ", " + getIdTipo(tipoProducto) + ");";
                ps = con.prepareStatement(query);
                int result = ps.executeUpdate();
                return result == 1;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean insertCliente(String rut, String razon, String direccion, String telefono, String tipoCliente) {
        try {
            if (existeCliente(rut) == null) {
                StringTokenizer st = new StringTokenizer(rut, "-");
                String rt = st.nextToken();
                String dv = st.nextToken();
                int tipo = getIdTipoCliente(tipoCliente.trim().toLowerCase());
                query = "INSERT INTO cliente VALUES(default, '" + rt + "', '" + dv + "', '" + razon + "', '" + direccion + "', '" + telefono + "' ,1 ," + tipo + ");";
                ps = con.prepareStatement(query);
                int result = ps.executeUpdate();
                if (result == 1) {
                    return true;
                }

                return false;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean insertTipoCliente(String direccion, int habilitado) {
        try {
            query = "INSERT INTO tipo_cliente VALUES(default, '" + direccion + "', " + habilitado + ");";
            ps = con.prepareStatement(query);
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    public static boolean insertTipoProducto(String direccion, int habilitado) {
        try {
            query = "INSERT INTO tipo_producto VALUES(default, '" + direccion + "', " + habilitado + ");";
            ps = con.prepareStatement(query);
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    public static boolean insertBodega(String direccion, String ubicacion, int habilitado) {
        try {
            query = "INSERT INTO bodega VALUES(default, '" + direccion + "', '"+ ubicacion +"', " + habilitado + ");";
            ps = con.prepareStatement(query);
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    public static ArrayList<String> getTipoCliente() {
        try {
            query = "SELECT descripcion FROM tipo_cliente where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<String> array = new ArrayList<>();
            while (rs.next()) {
                array.add(rs.getString("descripcion"));
            }
            return array;
        } catch (Exception e) {
            System.err.println("" + e);
            return null;
        }
    }

    public static ArrayList<String> getTipoProducto() {
        try {
            query = "SELECT descripcion FROM tipo_producto where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<String> array = new ArrayList<>();
            while (rs.next()) {
                array.add(rs.getString("descripcion"));

            }
            return array;
        } catch (Exception e) {
            System.err.println("" + e);
            return null;
        }
    }

    public static ArrayList<String> getDescBodega() {
        try {
            query = "SELECT nombre FROM bodega where habilitado = 1";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<String> array = new ArrayList<>();
            while (rs.next()) {
                array.add(rs.getString("nombre"));
            }
            return array;
        } catch (Exception e) {
            System.err.println("" + e);
            return null;
        }
    }
}
