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
public class ConjuroTest {
    
    public ConjuroTest() {
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
     * Test of getTipo method, of class Conjuro.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Conjuro instance = null;
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Conjuro.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Conjuro instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
