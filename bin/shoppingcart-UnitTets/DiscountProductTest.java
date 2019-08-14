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
public class DiscountProductTest {
    
    Product temp;
    
    public DiscountProductTest() {
        temp = new Product();
        temp.SetName("Headphones");
        temp.SetPrice(12);
        temp.SetInventory(24);
        temp.SetDescription("Blue");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of SetName method, of class DiscountProduct.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "Headphones" + " [Discounted]";
        DiscountProduct instance = new DiscountProduct(temp, 15);
        assertTrue(instance.Getname().equals(val));
        
    }

    /**
     * Test of SetPrice method, of class DiscountProduct.
     */
    @Test
    public void testSetPrice() {
        System.out.println("SetPrice");
        double val = 15.0;
        DiscountProduct instance = new DiscountProduct(temp, val);
        assertTrue(instance.GetPrice() == val);
    }

    /**
     * Test of SetDescription method, of class DiscountProduct.
     */
    @Test
    public void testSetDescription() {
        System.out.println("SetDescription");
        String val = "Black";
        DiscountProduct instance = new DiscountProduct(temp, 15);
        instance.SetDescription(val);
        assertTrue(instance.GetDescription().equals(val));
    }

    /**
     * Test of SetInventory method, of class DiscountProduct.
     */
    @Test
    public void testSetInventory() {
        System.out.println("SetInventory");
        int val = 33;
        DiscountProduct instance = new DiscountProduct(temp, 15);
        instance.SetInventory(val);
        assertTrue(instance.GetInventory() == val);
    }

    /**
     * Test of GetPrice method, of class DiscountProduct.
     */
    @Test
    public void testGetPrice() {
        System.out.println("GetPrice");
        DiscountProduct instance = new DiscountProduct(temp, 15);
        double expResult = 15.0;
        double result = instance.GetPrice();
        assertTrue(result == expResult);
    }

    /**
     * Test of GetDescription method, of class DiscountProduct.
     */
    @Test
    public void testGetDescription() {
        System.out.println("GetDescription");
        DiscountProduct instance = new DiscountProduct(temp, 15);
        String expResult = "Blue";
        String result = instance.GetDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of Getname method, of class DiscountProduct.
     */
    @Test
    public void testGetname() {
        System.out.println("Getname");
        DiscountProduct instance = new DiscountProduct(temp, 15);
        String expResult = "Headphones" + " [Discounted]";
        String result = instance.Getname();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetInventory method, of class DiscountProduct.
     */
    @Test
    public void testGetInventory() {
        System.out.println("GetInventory");
        DiscountProduct instance = new DiscountProduct(temp, 15);
        int expResult = temp.GetInventory();
        int result = instance.GetInventory();
        assertEquals(expResult, result);
    }
    
}
