/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import data.Carta;
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
public class RepositoryTest {
    
    public RepositoryTest() {
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
     * Test of addCarta method, of class Repository.
     */
    @Test
    public void testAddCarta() {
        System.out.println("addCarta");
        Carta carta = null;
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.addCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyCarta method, of class Repository.
     */
    @Test
    public void testModifyCarta() {
        System.out.println("modifyCarta");
        Carta carta = null;
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.modifyCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCarta method, of class Repository.
     */
    @Test
    public void testDeleteCarta() {
        System.out.println("deleteCarta");
        int id = 0;
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.deleteCarta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCollection method, of class Repository.
     */
    @Test
    public void testAddCollection() {
        System.out.println("addCollection");
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.addCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyCollection method, of class Repository.
     */
    @Test
    public void testModifyCollection() {
        System.out.println("modifyCollection");
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.modifyCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCollection method, of class Repository.
     */
    @Test
    public void testDeleteCollection() {
        System.out.println("deleteCollection");
        Repository instance = new RepositoryImpl();
        boolean expResult = false;
        boolean result = instance.deleteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RepositoryImpl implements Repository {

        public boolean addCarta(Carta carta) {
            return false;
        }

        public boolean modifyCarta(Carta carta) {
            return false;
        }

        public boolean deleteCarta(int id) {
            return false;
        }

        public boolean addCollection() {
            return false;
        }

        public boolean modifyCollection() {
            return false;
        }

        public boolean deleteCollection() {
            return false;
        }
    }
    
}
