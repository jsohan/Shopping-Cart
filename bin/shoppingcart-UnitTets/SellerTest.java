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
public class SellerTest {
    
    /**
     *
     */
    public SellerTest() {
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
     * Test of Add method, of class Seller.
     */
    @Test
    public void testAdd_Product() {
        System.out.println("Add");
        Product val = null;
        Seller instance = new Seller();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class Seller.
     */
    @Test
    public void testAdd_DiscountProduct() {
        System.out.println("Add");
        DiscountProduct val = null;
        Seller instance = new Seller();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class Seller.
     */
    @Test
    public void testAdd_BundleProduct() {
        System.out.println("Add");
        BundleProduct val = null;
        Seller instance = new Seller();
        instance.Add(val);
        
    }

    /**
     * Test of Remove method, of class Seller.
     */
    @Test
    public void testRemove_Product() {
        System.out.println("Remove");
        Product val = null;
        Seller instance = new Seller();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class Seller.
     */
    @Test
    public void testRemove_DiscountProduct() {
        System.out.println("Remove");
        DiscountProduct val = null;
        Seller instance = new Seller();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class Seller.
     */
    @Test
    public void testRemove_BundleProduct() {
        System.out.println("Remove");
        BundleProduct val = null;
        Seller instance = new Seller();
        instance.Remove(val);
        
    }

    /**
     * Test of num method, of class Seller.
     */
    @Test
    public void testNum() {
        System.out.println("num");
        Seller instance = new Seller();
        int expResult = 0;
        int result = instance.num();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ProdList method, of class Seller.
     */
    @Test
    public void testProdList() {
        System.out.println("ProdList");
        Seller instance = new Seller();
        PDList<Product> expResult = instance.ProdList();
        PDList<Product> result = instance.ProdList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DisList method, of class Seller.
     */
    @Test
    public void testDisList() {
        System.out.println("DisList");
        Seller instance = new Seller();
        PDList<DiscountProduct> expResult = instance.DisList();
        PDList<DiscountProduct> result = instance.DisList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BunList method, of class Seller.
     */
    @Test
    public void testBunList() {
        System.out.println("BunList");
        Seller instance = new Seller();
        PDList<BundleProduct> expResult = instance.BunList();
        PDList<BundleProduct> result = instance.BunList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetName method, of class Seller.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "";
        Seller instance = new Seller();
        instance.SetName(val);
        
    }

    /**
     * Test of SetPassword method, of class Seller.
     */
    @Test
    public void testSetPassword() {
        System.out.println("SetPassword");
        String val = "";
        Seller instance = new Seller();
        instance.SetPassword(val);
        
    }

    /**
     * Test of SetUsername method, of class Seller.
     */
    @Test
    public void testSetUsername() {
        System.out.println("SetUsername");
        String val = "";
        Seller instance = new Seller();
        instance.SetUsername(val);
        
    }

    /**
     * Test of GetName method, of class Seller.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        Seller instance = new Seller();
        String expResult = null;
        String result = instance.GetName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of GetPassword method, of class Seller.
     */
    @Test
    public void testGetPassword() {
        System.out.println("GetPassword");
        Seller instance = new Seller();
        String expResult = null;
        String result = instance.GetPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of GetUsername method, of class Seller.
     */
    @Test
    public void testGetUsername() {
        System.out.println("GetUsername");
        Seller instance = new Seller();
        String expResult = null;
        String result = instance.GetUsername();
        assertEquals(expResult, result);
        
    }
    
}
