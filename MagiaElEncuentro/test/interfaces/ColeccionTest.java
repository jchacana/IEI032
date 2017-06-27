/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import data.Carta;
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
     * Test of getCollection method, of class Coleccion.
     */
    @Test
    public void testGetCollection() {
        System.out.println("getCollection");
        Coleccion instance = new ColeccionImpl();
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCarta method, of class Coleccion.
     */
    @Test
    public void testAddCarta() {
        System.out.println("addCarta");
        Carta c = null;
        Coleccion instance = new ColeccionImpl();
        boolean expResult = false;
        boolean result = instance.addCarta(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCarta method, of class Coleccion.
     */
    @Test
    public void testRemoveCarta() {
        System.out.println("removeCarta");
        Carta c = null;
        Coleccion instance = new ColeccionImpl();
        boolean expResult = false;
        boolean result = instance.removeCarta(c);
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
        Coleccion instance = new ColeccionImpl();
        boolean expResult = false;
        boolean result = instance.updateCollection(collection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ColeccionImpl implements Coleccion {

        public ArrayList<Carta> getCollection() {
            return null;
        }

        public boolean addCarta(Carta c) {
            return false;
        }

        public boolean removeCarta(Carta c) {
            return false;
        }

        public boolean updateCollection(ArrayList<Carta> collection) {
            return false;
        }
    }
    
}
