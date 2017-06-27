/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mikka
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({connections.ConnectionDatabaseTest.class, connections.CollectionConnectionTest.class, connections.CardConnectionTest.class, connections.TierraHandlerTest.class, connections.ConjuroHandlerTest.class, connections.CardConnectionHandlerTest.class, connections.CriaturaHandlerTest.class})
public class ConnectionsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
