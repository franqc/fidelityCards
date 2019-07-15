/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import database.DataBase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class BranchIT {
    
    
    public BranchIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * Test of validate method, of class Branch.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        DataBase database = new DataBase("fidelityDatabase");
        Branch instance = new Branch(database);
        boolean expResult = false;
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        boolean result = instance.validate();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Branch.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        DataBase resultDatabase = new DataBase("testDatabase");
        
        Branch instance = new Branch(resultDatabase);
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        resultDatabase = instance.create();
        
        DataBase expectedDatabase = new DataBase("testDatabase");
        
        expectedDatabase.branches.add(instance);
        
        int expected = expectedDatabase.branches.get(0).idCompany + 
                expectedDatabase.branches.get(0).idBranch;
        
        int result = resultDatabase.branches.get(0).idCompany +
                resultDatabase.branches.get(0).idBranch;
        
        assertEquals(expected, result);
    }

    /**
     * Test of read method, of class Branch.
     */
    @Test
    public void testRead_0args() throws Exception {
        String expected = "CompanyId: " + 1 + 
                        ", BranchId: " + 1 + 
                        ", State: " + "San Jose" +
                        ", City: " + "Central" +
                        ", Town: " + "Paseo Colon" +
                        ", Street: "+ "Contiguo al edificio Mercedes";
        
        DataBase resultDatabase = new DataBase("testDatabase");
        
        Branch instance = new Branch(resultDatabase);
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        
        resultDatabase = instance.create();
        
        instance.read();
        String result = outContent.toString();
        
        assertEquals(expected.trim().toLowerCase(), result.trim().toLowerCase());
    }

    /**
     * Test of read method, of class Branch.
     */
    @Test
    public void testRead_ACompany() throws Exception {
        String expected = "CompanyId: " + 1 + 
                        ", BranchId: " + 1 + 
                        ", State: " + "San Jose" +
                        ", City: " + "Central" +
                        ", Town: " + "Paseo Colon" +
                        ", Street: "+ "Contiguo al edificio Mercedes";
        
        DataBase resultDatabase = new DataBase("testDatabase");
        
        Branch instance = new Branch(resultDatabase);
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        resultDatabase = instance.create();
        
        Branch newInstance = new Branch(resultDatabase);
        newInstance.idCompany = 1;
        newInstance.idBranch = 2;
        newInstance.state = "Heredia";
        newInstance.city = "Flores";
        newInstance.town = "San Roque";
        newInstance.street = "Frente al mini super la conciencia";
        resultDatabase = newInstance.create();
        
        instance.read(instance);
        
        String result = outContent.toString();
        
        assertEquals(expected.trim().toLowerCase(), result.trim().toLowerCase());
    }

    /**
     * Test of update method, of class Branch.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        DataBase resultDatabase = new DataBase("testDatabase");
        
        Branch instance = new Branch(resultDatabase);
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        resultDatabase = instance.create();
        
        instance.street = "Frente al banco Nacional";
        resultDatabase = instance.update();
        
        String expected = instance.street;
        
        String result = resultDatabase.branches.get(0).street;
        
        assertEquals(expected, result);
    }

    /**
     * Test of delete method, of class Branch.
     */
    @Test
    public void testDelete() throws Exception {
        String expected = "CompanyId: " + 1 + 
                        ", BranchId: " + 1 + 
                        ", State: " + "San Jose" +
                        ", City: " + "Central" +
                        ", Town: " + "Paseo Colon" +
                        ", Street: "+ "Contiguo al edificio Mercedes";
        
        DataBase resultDatabase = new DataBase("testDatabase");
        
        Branch instance = new Branch(resultDatabase);
        instance.idCompany = 1;
        instance.idBranch = 1;
        instance.state = "San Jose";
        instance.city = "Central";
        instance.town = "Paseo Colon";
        instance.street = "Contiguo al edificio Mercedes";
        resultDatabase = instance.create();
        
        Branch newInstance = new Branch(resultDatabase);
        newInstance.idCompany = 1;
        newInstance.idBranch = 2;
        newInstance.state = "Heredia";
        newInstance.city = "Flores";
        newInstance.town = "San Roque";
        newInstance.street = "Frente al mini super la conciencia";
        resultDatabase = newInstance.create();
        
        resultDatabase = newInstance.delete();
        
        assertEquals(1,resultDatabase.branches.size());
    }
    
}
