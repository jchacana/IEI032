/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import data.Carta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class CardConnectionHandlerTest {
    
    public CardConnectionHandlerTest() {
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
     * Test of setSuccessor method, of class CardConnectionHandler.
     */
    @Test
    public void testSetSuccessor() {
        System.out.println("setSuccessor");
        CardConnectionHandler successor = null;
        CardConnectionHandler instance = new CardConnectionHandlerImpl();
        instance.setSuccessor(successor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleAdd method, of class CardConnectionHandler.
     */
    @Test
    public void testHandleAdd() throws Exception {
        System.out.println("handleAdd");
        Carta card = null;
        Connection con = null;
        CardConnectionHandler instance = new CardConnectionHandlerImpl();
        List<PreparedStatement> expResult = null;
        List<PreparedStatement> result = instance.handleAdd(card, con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleModify method, of class CardConnectionHandler.
     */
    @Test
    public void testHandleModify() throws Exception {
        System.out.println("handleModify");
        Carta card = null;
        Connection con = null;
        CardConnectionHandler instance = new CardConnectionHandlerImpl();
        List<PreparedStatement> expResult = null;
        List<PreparedStatement> result = instance.handleModify(card, con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCardStatement method, of class CardConnectionHandler.
     */
    @Test
    public void testPrepareCardStatement() {
        System.out.println("prepareCardStatement");
        Carta card = null;
        CardConnectionHandler instance = new CardConnectionHandlerImpl();
        String expResult = "";
        String result = instance.prepareCardStatement(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CardConnectionHandlerImpl extends CardConnectionHandler {

        public List<PreparedStatement> handleAdd(Carta card, Connection con) throws SQLException {
            return null;
        }

        public List<PreparedStatement> handleModify(Carta card, Connection con) throws SQLException {
            return null;
        }
    }
    
}
