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
public class CriaturaTest {
    
    public CriaturaTest() {
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
     * Test of getAtaque method, of class Criatura.
     */
    @Test
    public void testGetAtaque() {
        System.out.println("getAtaque");
        Criatura instance = null;
        int expResult = 0;
        int result = instance.getAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResistencia method, of class Criatura.
     */
    @Test
    public void testGetResistencia() {
        System.out.println("getResistencia");
        Criatura instance = null;
        int expResult = 0;
        int result = instance.getResistencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtaque method, of class Criatura.
     */
    @Test
    public void testSetAtaque() {
        System.out.println("setAtaque");
        int ataque = 0;
        Criatura instance = null;
        instance.setAtaque(ataque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResistencia method, of class Criatura.
     */
    @Test
    public void testSetResistencia() {
        System.out.println("setResistencia");
        int resistencia = 0;
        Criatura instance = null;
        instance.setResistencia(resistencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
