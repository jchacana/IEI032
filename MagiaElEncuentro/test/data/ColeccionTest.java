/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
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
public class ColeccionTest {
    
    public ColeccionTest() {
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
     * Test of getId method, of class Coleccion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Coleccion instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Coleccion.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Coleccion instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollection method, of class Coleccion.
     */
    @Test
    public void testGetCollection() {
        System.out.println("getCollection");
        Coleccion instance = null;
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Coleccion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Coleccion instance = null;
        instance.setId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Coleccion.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String tipo = "";
        Coleccion instance = null;
        instance.setType(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollection method, of class Coleccion.
     */
    @Test
    public void testSetCollection() {
        System.out.println("setCollection");
        ArrayList<Carta> collection = null;
        Coleccion instance = null;
        instance.setCollection(collection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Coleccion.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Carta c = null;
        Coleccion instance = null;
        boolean expResult = false;
        boolean result = instance.removeCard(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCollection method, of class Coleccion.
     */
    @Test
    public void testUpdateCollection() {
        System.out.println("updateCollection");
        ArrayList<Carta> collection = null;
        Coleccion instance = null;
        boolean expResult = false;
        boolean result = instance.updateCollection(collection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ColeccionImpl extends Coleccion {

        public ColeccionImpl() {
            super("");
        }
    }
    
}
