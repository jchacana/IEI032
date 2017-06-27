/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import data.Conjuro;
import data.Criatura;
import data.Tierra;
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
public class CardConnectionTest {


    public CardConnectionTest() {
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
     * Test of addCarta method, of class CardConnection.
     */
    @Test
    public void testAddCarta() {
        System.out.println("addCarta");
        Carta carta = null;
        CardConnection instance = new CardConnection();
        boolean expResult = false;
        boolean result = instance.addCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyCarta method, of class CardConnection.
     */
    @Test
    public void testModifyCarta() {
        System.out.println("modifyCarta");
        Carta carta = null;
        CardConnection instance = new CardConnection();
        boolean expResult = false;
        boolean result = instance.modifyCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCarta method, of class CardConnection.
     */
    @Test
    public void testDeleteCarta() {
        System.out.println("deleteCarta");
        int id = 0;
        CardConnection instance = new CardConnection();
        boolean expResult = false;
        boolean result = instance.deleteCarta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
