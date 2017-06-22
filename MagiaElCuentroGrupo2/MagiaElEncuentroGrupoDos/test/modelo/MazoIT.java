/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
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
public class MazoIT {
    
    public MazoIT() {
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
     * Test of getIdMazo method, of class Mazo.
     */
    @Test
    public void testGetIdMazo() {
        System.out.println("getIdMazo");
        Mazo instance = null;
        int expResult = 0;
        int result = instance.getIdMazo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoMazo method, of class Mazo.
     */
    @Test
    public void testGetTipoMazo() {
        System.out.println("getTipoMazo");
        Mazo instance = null;
        String expResult = "";
        String result = instance.getTipoMazo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadCartas method, of class Mazo.
     */
    @Test
    public void testGetCantidadCartas() {
        System.out.println("getCantidadCartas");
        Mazo instance = null;
        int expResult = 0;
        int result = instance.getCantidadCartas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArregloCartas method, of class Mazo.
     */
    @Test
    public void testGetArregloCartas() {
        System.out.println("getArregloCartas");
        Mazo instance = null;
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getArregloCartas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMazo method, of class Mazo.
     */
    @Test
    public void testSetIdMazo() {
        System.out.println("setIdMazo");
        int idMazo = 0;
        Mazo instance = null;
        instance.setIdMazo(idMazo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoMazo method, of class Mazo.
     */
    @Test
    public void testSetTipoMazo() {
        System.out.println("setTipoMazo");
        String tipoMazo = "";
        Mazo instance = null;
        instance.setTipoMazo(tipoMazo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadCartas method, of class Mazo.
     */
    @Test
    public void testSetCantidadCartas() {
        System.out.println("setCantidadCartas");
        int cantidadCartas = 0;
        Mazo instance = null;
        instance.setCantidadCartas(cantidadCartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mazo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mazo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
