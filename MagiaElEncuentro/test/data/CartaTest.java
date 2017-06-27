/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikka
 */
public class CartaTest {
    
    public CartaTest() {
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
     * Test of getId method, of class Carta.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Carta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Carta instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Carta.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIlustrador method, of class Carta.
     */
    @Test
    public void testGetIlustrador() {
        System.out.println("getIlustrador");
        Carta instance = null;
        String expResult = "";
        String result = instance.getIlustrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdicion method, of class Carta.
     */
    @Test
    public void testGetEdicion() {
        System.out.println("getEdicion");
        Carta instance = null;
        String expResult = "";
        String result = instance.getEdicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Carta.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Carta instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Carta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Carta instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCosto method, of class Carta.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Carta instance = null;
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIlustrador method, of class Carta.
     */
    @Test
    public void testSetIlustrador() {
        System.out.println("setIlustrador");
        String ilustrador = "";
        Carta instance = null;
        instance.setIlustrador(ilustrador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdicion method, of class Carta.
     */
    @Test
    public void testSetEdicion() {
        System.out.println("setEdicion");
        String edicion = "";
        Carta instance = null;
        instance.setEdicion(edicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Carta.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Carta instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDisponible method, of class Carta.
     */
    @Test
    public void testIsDisponible() {
        System.out.println("isDisponible");
        Carta instance = null;
        boolean expResult = false;
        boolean result = instance.isDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponible method, of class Carta.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        Carta instance = null;
        instance.setDisponible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CartaImpl extends Carta {

        public CartaImpl() {
            super(0, "", 0, "", "", "");
        }
    }
    
}
