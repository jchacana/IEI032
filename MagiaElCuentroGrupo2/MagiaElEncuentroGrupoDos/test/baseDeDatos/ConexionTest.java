/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import java.util.ArrayList;
import modelo.Carta;
import modelo.Mazo;
import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier
 */
public class ConexionTest {
    
    public ConexionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of consultarCarta method, of class Conexion.
     */
    @Test
    public void testConsultarCarta() {
        System.out.println("consultarCarta");
        int id = 0;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.consultarCarta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCarta method, of class Conexion.
     */
    @Test
    public void testAgregarCarta() {
        System.out.println("agregarCarta");
        Carta carta = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.agregarCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarios method, of class Conexion.
     */
    @Test
    public void testObtenerUsuarios() {
        System.out.println("obtenerUsuarios");
        Conexion instance = new Conexion();
        instance.obtenerUsuarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarUsuario method, of class Conexion.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        Usuario usuario = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.agregarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class Conexion.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        Usuario usuario = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.eliminarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarUsuario method, of class Conexion.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        Usuario usuario = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.actualizarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerMazos method, of class Conexion.
     */
    @Test
    public void testTraerMazos() {
        System.out.println("traerMazos");
        Conexion instance = new Conexion();
        instance.traerMazos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimoIdMazos method, of class Conexion.
     */
    @Test
    public void testUltimoIdMazos() {
        System.out.println("ultimoIdMazos");
        Conexion instance = new Conexion();
        int expResult = 0;
        int result = instance.ultimoIdMazos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarMazo method, of class Conexion.
     */
    @Test
    public void testAgregarMazo() {
        System.out.println("agregarMazo");
        Mazo mazos = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.agregarMazo(mazos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMazo method, of class Conexion.
     */
    @Test
    public void testEliminarMazo() {
        System.out.println("eliminarMazo");
        Mazo mazos = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.eliminarMazo(mazos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTodosLosMazos method, of class Conexion.
     */
    @Test
    public void testRetornarTodosLosMazos() {
        System.out.println("retornarTodosLosMazos");
        Conexion instance = new Conexion();
        ArrayList<Mazo> expResult = null;
        ArrayList<Mazo> result = instance.retornarTodosLosMazos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarMazo method, of class Conexion.
     */
    @Test
    public void testActualizarMazo() {
        System.out.println("actualizarMazo");
        Mazo mazo = null;
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.actualizarMazo(mazo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
