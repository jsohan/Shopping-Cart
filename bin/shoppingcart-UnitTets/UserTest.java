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
public class UserTest {
    
    /**
     *
     */
    public UserTest() {
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
     * Test of Add method, of class User.
     */
    @Test
    public void testAdd_Product() {
        System.out.println("Add");
        Product val = null;
        User instance = new UserImpl();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class User.
     */
    @Test
    public void testAdd_DiscountProduct() {
        System.out.println("Add");
        DiscountProduct val = null;
        User instance = new UserImpl();
        instance.Add(val);
        
    }

    /**
     * Test of Add method, of class User.
     */
    @Test
    public void testAdd_BundleProduct() {
        System.out.println("Add");
        BundleProduct val = null;
        User instance = new UserImpl();
        instance.Add(val);
        
    }

    /**
     * Test of Remove method, of class User.
     */
    @Test
    public void testRemove_Product() {
        System.out.println("Remove");
        Product val = null;
        User instance = new UserImpl();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class User.
     */
    @Test
    public void testRemove_DiscountProduct() {
        System.out.println("Remove");
        DiscountProduct val = null;
        User instance = new UserImpl();
        instance.Remove(val);
        
    }

    /**
     * Test of Remove method, of class User.
     */
    @Test
    public void testRemove_BundleProduct() {
        System.out.println("Remove");
        BundleProduct val = null;
        User instance = new UserImpl();
        instance.Remove(val);
        
    }

    /**
     * Test of ProdList method, of class User.
     */
    @Test
    public void testProdList() {
        System.out.println("ProdList");
        User instance = new UserImpl();
        PDList<Product> expResult = null;
        PDList<Product> result = instance.ProdList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DisList method, of class User.
     */
    @Test
    public void testDisList() {
        System.out.println("DisList");
        User instance = new UserImpl();
        PDList<DiscountProduct> expResult = null;
        PDList<DiscountProduct> result = instance.DisList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BunList method, of class User.
     */
    @Test
    public void testBunList() {
        System.out.println("BunList");
        User instance = new UserImpl();
        PDList<BundleProduct> expResult = null;
        PDList<BundleProduct> result = instance.BunList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of num method, of class User.
     */
    @Test
    public void testNum() {
        System.out.println("num");
        User instance = new UserImpl();
        int expResult = 0;
        int result = instance.num();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String val = "";
        User instance = new UserImpl();
        instance.SetName(val);
        
    }

    /**
     * Test of SetPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("SetPassword");
        String val = "";
        User instance = new UserImpl();
        instance.SetPassword(val);
        
    }

    /**
     * Test of SetUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("SetUsername");
        String val = "";
        User instance = new UserImpl();
        instance.SetUsername(val);
        
    }

    /**
     * Test of GetName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        User instance = new UserImpl();
        String expResult = "";
        String result = instance.GetName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of GetPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("GetPassword");
        User instance = new UserImpl();
        String expResult = "";
        String result = instance.GetPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of GetUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("GetUsername");
        User instance = new UserImpl();
        String expResult = "";
        String result = instance.GetUsername();
        assertEquals(expResult, result);
        
    }

    /**
     *
     */
    public class UserImpl implements User {

        /**
         *
         * @param val
         */
        public void Add(Product val) {
        }

        /**
         *
         * @param val
         */
        public void Add(DiscountProduct val) {
        }

        /**
         *
         * @param val
         */
        public void Add(BundleProduct val) {
        }

        /**
         *
         * @param val
         */
        public void Remove(Product val) {
        }

        /**
         *
         * @param val
         */
        public void Remove(DiscountProduct val) {
        }

        /**
         *
         * @param val
         */
        public void Remove(BundleProduct val) {
        }

        /**
         *
         * @return
         */
        public PDList<Product> ProdList() {
            return null;
        }

        /**
         *
         * @return
         */
        public PDList<DiscountProduct> DisList() {
            return null;
        }

        /**
         *
         * @return
         */
        public PDList<BundleProduct> BunList() {
            return null;
        }

        /**
         *
         * @return
         */
        public int num() {
            return 0;
        }

        /**
         *
         * @param val
         */
        public void SetName(String val) {
        }

        /**
         *
         * @param val
         */
        public void SetPassword(String val) {
        }

        /**
         *
         * @param val
         */
        public void SetUsername(String val) {
        }

        /**
         *
         * @return
         */
        public String GetName() {
            return "";
        }

        /**
         *
         * @return
         */
        public String GetPassword() {
            return "";
        }

        /**
         *
         * @return
         */
        public String GetUsername() {
            return "";
        }
    }
    
}
