/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
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
public class CriaturaHandlerTest {
    
    public CriaturaHandlerTest() {
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
     * Test of handleAdd method, of class CriaturaHandler.
     */
    @Test
    public void testHandleAdd() throws Exception {
        System.out.println("handleAdd");
        Carta card = null;
        Connection con = null;
        CriaturaHandler instance = new CriaturaHandler();
        List<PreparedStatement> expResult = null;
        List<PreparedStatement> result = instance.handleAdd(card, con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleModify method, of class CriaturaHandler.
     */
    @Test
    public void testHandleModify() throws Exception {
        System.out.println("handleModify");
        Carta card = null;
        Connection con = null;
        CriaturaHandler instance = new CriaturaHandler();
        List<PreparedStatement> expResult = null;
        List<PreparedStatement> result = instance.handleModify(card, con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
