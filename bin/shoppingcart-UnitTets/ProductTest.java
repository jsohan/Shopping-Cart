/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josh
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of SetName method, of class Product.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "headphones";
        Product instance = new Product();
        instance.SetName(val);
        assertTrue(instance.Getname().equals(val));
    }

    /**
     * Test of SetPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("SetPrice");
        double val = 12.0;
        Product instance = new Product();
        instance.SetPrice(val);
       assertTrue(instance.GetPrice() == val);
    }

    /**
     * Test of SetDescription method, of class Product.
     */
    @Test
    public void testSetDescription() {
        System.out.println("SetDescription");
        String val = "Blue 5in long headphones";
        Product instance = new Product();
        instance.SetDescription(val);
        assertTrue(instance.GetDescription().equals(val));
    }

    /**
     * Test of SetInventory method, of class Product.
     */
    @Test
    public void testSetInventory() {
        System.out.println("SetInventory");
        int val = 20;
        Product instance = new Product();
        instance.SetInventory(val);
        assertTrue(instance.GetInventory() == val);
    }

    /**
     * Test of GetPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("GetPrice");
        Product instance = new Product();
        double expResult = 30.0;
        instance.SetPrice(30.0);
        double result = instance.GetPrice();
        assertTrue(result == expResult);
    }

    /**
     * Test of GetDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("GetDescription");
        Product instance = new Product();
        String expResult = "Blue Headphones";
        instance.SetDescription(expResult);
        String result = instance.GetDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of Getname method, of class Product.
     */
    @Test
    public void testGetname() {
        System.out.println("Getname");
        Product instance = new Product();
        String expResult = "Headphones";
        instance.SetName(expResult);
        String result = instance.Getname();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetInventory method, of class Product.
     */
    @Test
    public void testGetInventory() {
        System.out.println("GetInventory");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.GetInventory();
        assertEquals(expResult, result);
    }
    
}
