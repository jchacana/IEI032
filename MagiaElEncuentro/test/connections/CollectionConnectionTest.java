/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Coleccion;
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
public class CollectionConnectionTest {
    
    public CollectionConnectionTest() {
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
     * Test of AddCarta method, of class CollectionConnection.
     */
    @Test
    public void testAddCarta() throws Exception {
        System.out.println("AddCarta");
        Carta card = null;
        Coleccion col = null;
        CollectionConnection instance = new CollectionConnection();
        boolean expResult = false;
        boolean result = instance.AddCarta(card, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveCarta method, of class CollectionConnection.
     */
    @Test
    public void testRemoveCarta() throws Exception {
        System.out.println("RemoveCarta");
        Carta card = null;
        Coleccion col = null;
        CollectionConnection instance = new CollectionConnection();
        boolean expResult = false;
        boolean result = instance.RemoveCarta(card, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCollection method, of class CollectionConnection.
     */
    @Test
    public void testAddCollection() throws Exception {
        System.out.println("addCollection");
        Coleccion col = null;
        int id_usuario = 0;
        CollectionConnection instance = new CollectionConnection();
        boolean expResult = false;
        boolean result = instance.addCollection(col, id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyCollection method, of class CollectionConnection.
     */
    @Test
    public void testModifyCollection() {
        System.out.println("modifyCollection");
        CollectionConnection instance = new CollectionConnection();
        boolean expResult = false;
        boolean result = instance.modifyCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCollection method, of class CollectionConnection.
     */
    @Test
    public void testDeleteCollection() {
        System.out.println("deleteCollection");
        CollectionConnection instance = new CollectionConnection();
        boolean expResult = false;
        boolean result = instance.deleteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
