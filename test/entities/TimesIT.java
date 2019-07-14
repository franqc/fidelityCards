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
public class TimesIT {
    
    public TimesIT() {
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
     * Test of setDay method, of class Times.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        Day day = null;
        Times instance = null;
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Times.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Times instance = null;
        String expResult = "";
        String result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpenTime method, of class Times.
     */
    @Test
    public void testSetOpenTime() throws Exception {
        System.out.println("setOpenTime");
        int opening = 0;
        Times instance = null;
        instance.setOpenTime(opening);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCloseTime method, of class Times.
     */
    @Test
    public void testSetCloseTime() throws Exception {
        System.out.println("setCloseTime");
        int closing = 0;
        Times instance = null;
        instance.setCloseTime(closing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenTime method, of class Times.
     */
    @Test
    public void testGetOpenTime() {
        System.out.println("getOpenTime");
        Times instance = null;
        int expResult = 0;
        int result = instance.getOpenTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCloseTime method, of class Times.
     */
    @Test
    public void testGetCloseTime() {
        System.out.println("getCloseTime");
        Times instance = null;
        int expResult = 0;
        int result = instance.getCloseTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Times.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Times instance = null;
        DataBase expResult = null;
        DataBase result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Times.
     */
    @Test
    public void testRead_0args() throws Exception {
        System.out.println("read");
        Times instance = null;
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Times.
     */
    @Test
    public void testRead_ACompany() throws Exception {
        System.out.println("read");
        ACompany element = null;
        Times instance = null;
        instance.read(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Times.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Times instance = null;
        DataBase expResult = null;
        DataBase result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Times.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Times instance = null;
        DataBase expResult = null;
        DataBase result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class Times.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Times instance = null;
        boolean expResult = false;
        boolean result = instance.validate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
