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
public class TierraTest {
    
    public TierraTest() {
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
     * Test of getMana method, of class Tierra.
     */
    @Test
    public void testGetMana() {
        System.out.println("getMana");
        Tierra instance = null;
        int expResult = 0;
        int result = instance.getMana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMana method, of class Tierra.
     */
    @Test
    public void testSetMana() {
        System.out.println("setMana");
        int mana = 0;
        Tierra instance = null;
        instance.setMana(mana);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
