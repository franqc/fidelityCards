/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import database.DataBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jheron Chacon
 */
public class PriceIT {
    
    public PriceIT() {
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
     * Test of create method, of class Price.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Price instance = null;
        DataBase expResult = null;
        DataBase result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Price.
     */
    @Test
    public void testRead_0args() throws Exception {
        System.out.println("read");
        Price instance = null;
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Price.
     */
    @Test
    public void testRead_ACompany() throws Exception {
        System.out.println("read");
        ACompany element = null;
        Price instance = null;
        instance.read(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Price.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Price instance = null;
        DataBase expResult = null;
        DataBase result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Price.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Price instance = null;
        DataBase expResult = null;
        DataBase result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class Price.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Price instance = null;
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
