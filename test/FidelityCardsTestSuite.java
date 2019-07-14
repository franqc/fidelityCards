/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Jheron Chacon
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    controllers.BranchControllerIT.class,
    controllers.CardControllerIT.class,
    controllers.ClientControllerIT.class,
    controllers.CompanyControllerIT.class,
    controllers.PhoneControllerIT.class,
    controllers.PriceControllerIT.class,
    controllers.TimeControllerIT.class,
    entities.BranchIT.class,
    entities.ClientIT.class,
    entities.CompanyIT.class,
    entities.FidelityCardIT.class,
    entities.PhoneIT.class,
    entities.PriceIT.class,
    entities.TimesIT.class
})

public class FidelityCardsTestSuite {

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
