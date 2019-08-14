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
public class BundleProductTest {
    
    /**
     *
     */
    public BundleProductTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of BundleProduct method, of class BundleProduct.
     */
    @Test
    public void testBundleProduct() {
        System.out.println("BundleProduct");
        BundleProduct instance = new BundleProduct();
        instance.BundleProduct();
       
        
    }

    /**
     * Test of AddProd method, of class BundleProduct.
     */
    @Test
    public void testAddProd_Product() {
        System.out.println("AddProd");
        Product instance = new Product();
        instance.SetInventory(0);
        instance.SetPrice(0);
        
        
    }

    /**
     * Test of AddProd method, of class BundleProduct.
     */
    @Test
    public void testAddProd_DiscountProduct() {
        System.out.println("AddProd");
        BundleProduct instance = new BundleProduct();
        instance.SetInventory(0);
        instance.SetPrice(0);
        
        
        }

    /**
     * Test of SetName method, of class BundleProduct.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "";
        BundleProduct instance = new BundleProduct();
        instance.SetName(val);
        
    }

    /**
     * Test of SetPrice method, of class BundleProduct.
     */
    @Test
    public void testSetPrice() {
        System.out.println("SetPrice");
        double val = 0.0;
        BundleProduct instance = new BundleProduct();
        instance.SetPrice(val);
        
    }

    /**
     * Test of SetDescription method, of class BundleProduct.
     */
    @Test
    public void testSetDescription() {
        System.out.println("SetDescription");
        String val = "";
        BundleProduct instance = new BundleProduct();
        instance.SetDescription(val);
        
    }

    /**
     * Test of SetInventory method, of class BundleProduct.
     */
    @Test
    public void testSetInventory() {
        System.out.println("SetInventory");
        int val = 0;
        BundleProduct instance = new BundleProduct();
        instance.SetInventory(val);
        
    }

    /**
     * Test of GetPrice method, of class BundleProduct.
     */
    @Test
    public void testGetPrice() {
        System.out.println("GetPrice");
        BundleProduct instance = new BundleProduct();
        double expResult = 0.0;
        double result = instance.GetPrice();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of GetDescription method, of class BundleProduct.
     */
    @Test
    public void testGetDescription() {
        System.out.println("Get Description");
        BundleProduct instance = new BundleProduct();
        String expResult = "";
        instance.GetDescription();
        
        
    }

    /**
     * Test of Getname method, of class BundleProduct.
     */
    @Test
    public void testGetname() {
        System.out.println("Getname");
        BundleProduct instance = new BundleProduct();
        String expResult = "Headphones";
        instance.SetName(expResult);
        String result = instance.Getname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of GetInventory method, of class BundleProduct.
     */
    @Test
    public void testGetInventory() {
        System.out.println("SetInventory");
        int val = 20;
        BundleProduct instance = new BundleProduct();
        instance.SetInventory(val);
       
        
       
        
    }

    /**
     * Test of GetString method, of class BundleProduct.
     */
    @Test
    public void testGetString() {
        System.out.println("GetString");
        BundleProduct instance = new BundleProduct();
        String expResult = "";
        String result = instance.GetString();
        assertEquals(expResult, result);
        
    }
    
}
