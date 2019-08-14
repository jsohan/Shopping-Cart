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
public class CustomerTest {
    
    /**
     *
     */
    public CustomerTest() {
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
     * Test of Add method, of class Customer.
     */
    @Test
    public void testAdd_Product() {
        System.out.println("Add");
        Product val = null;
        Customer instance = new Customer();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class Customer.
     */
    @Test
    public void testAdd_DiscountProduct() {
        System.out.println("Add");
        DiscountProduct val = null;
        Customer instance = new Customer();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class Customer.
     */
    @Test
    public void testAdd_BundleProduct() {
        System.out.println("Add");
        BundleProduct val = null;
        Customer instance = new Customer();
        instance.Add(val);
        
    }

    /**
     * Test of Remove method, of class Customer.
     */
    @Test
    public void testRemove_Product() {
        System.out.println("Remove");
        Product val = null;
        Customer instance = new Customer();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class Customer.
     */
    @Test
    public void testRemove_DiscountProduct() {
        System.out.println("Remove");
        DiscountProduct val = null;
        Customer instance = new Customer();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class Customer.
     */
    @Test
    public void testRemove_BundleProduct() {
        System.out.println("Remove");
        BundleProduct val = null;
        Customer instance = new Customer();
        instance.Remove(val);
        
    }

    /**
     * Test of num method, of class Customer.
     */
    @Test
    public void testNum() {
        System.out.println("num");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.num();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ProdList method, of class Customer.
     */
    @Test
    public void testProdList() {
        System.out.println("ProdList");
        Customer instance = new Customer();
        PDList<Product> expResult = null;
        PDList<Product> result = instance.ProdList();
        
        
        
    }

    /**
     * Test of DisList method, of class Customer.
     */
    @Test
    public void testDisList() {
        System.out.println("DisList");
        Customer instance = new Customer();
        PDList<DiscountProduct> expResult = null;
        PDList<DiscountProduct> result = instance.DisList();
        
        
    }

    /**
     * Test of BunList method, of class Customer.
     */
    @Test
    public void testBunList() {
        System.out.println("BunList");
        Customer instance = new Customer();
        PDList<BundleProduct> expResult = null;
        PDList<BundleProduct> result = instance.BunList();
        
        
    }

    /**
     * Test of SetName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "";
        Customer instance = new Customer();
        instance.SetName(val);
        
    }

    /**
     * Test of SetPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        System.out.println("SetPassword");
        String val = "";
        Customer instance = new Customer();
        instance.SetPassword(val);
        
    }

    /**
     * Test of SetUsername method, of class Customer.
     */
    @Test
    public void testSetUsername() {
        System.out.println("SetUsername");
        String val = "";
        Customer instance = new Customer();
        instance.SetUsername(val);
        
    }

    /**
     * Test of GetName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.GetName();
        
       
    }

    /**
     * Test of GetPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        System.out.println("GetPassword");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.GetPassword();
        
    }

    /**
     * Test of GetUsername method, of class Customer.
     */
    @Test
    public void testGetUsername() {
        System.out.println("GetUsername");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.GetUsername();
        
        
    }
    
}
