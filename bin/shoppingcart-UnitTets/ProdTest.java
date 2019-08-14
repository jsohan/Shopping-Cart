/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jamil
 */
public class ProdTest {
    
    public ProdTest() {
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
     * Test of SetName method, of class Prod.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "";
        Prod instance = new ProdImpl();
        instance.SetName(val);
        
    }

    /**
     * Test of SetPrice method, of class Prod.
     */
    @Test
    public void testSetPrice() {
        System.out.println("SetPrice");
        double val = 0.0;
        Prod instance = new ProdImpl();
        instance.SetPrice(val);
        
    }

    /**
     * Test of SetDescription method, of class Prod.
     */
    @Test
    public void testSetDescription() {
        System.out.println("SetDescription");
        String val = "";
        Prod instance = new ProdImpl();
        instance.SetDescription(val);
        
    }

    /**
     * Test of SetInventory method, of class Prod.
     */
    @Test
    public void testSetInventory() {
        System.out.println("SetInventory");
        int val = 0;
        Prod instance = new ProdImpl();
        instance.SetInventory(val);
        
    }

    /**
     * Test of GetPrice method, of class Prod.
     */
    @Test
    public void testGetPrice() {
        System.out.println("GetPrice");
        Prod instance = new ProdImpl();
        double expResult = 0.0;
        double result = instance.GetPrice();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of GetDescription method, of class Prod.
     */
    @Test
    public void testGetDescription() {
        System.out.println("GetDescription");
        Prod instance = new ProdImpl();
        String expResult = "";
        String result = instance.GetDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Getname method, of class Prod.
     */
    @Test
    public void testGetname() {
        System.out.println("Getname");
        Prod instance = new ProdImpl();
        String expResult = "";
        String result = instance.Getname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of GetInventory method, of class Prod.
     */
    @Test
    public void testGetInventory() {
        System.out.println("GetInventory");
        Prod instance = new ProdImpl();
        int expResult = 0;
        int result = instance.GetInventory();
        assertEquals(expResult, result);
        
    }

    public class ProdImpl implements Prod {

        public void SetName(String val) {
        }

        public void SetPrice(double val) {
        }

        public void SetDescription(String val) {
        }

        public void SetInventory(int val) {
        }

        public double GetPrice() {
            return 0.0;
        }

        public String GetDescription() {
            return "";
        }

        public String Getname() {
            return "";
        }

        public int GetInventory() {
            return 0;
        }
    }
    
}
