/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Collection;
import java.util.Iterator;
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
public class PDListTest {
    
    public PDListTest() {
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
     * Test of remove method, of class PDList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object e = null;
        PDList instance = new PDList();
        instance.remove(e);
        
    }

    /**
     * Test of getItem method, of class PDList.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        PDList instance = new PDList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        
        
    }

    /**
     * Test of size method, of class PDList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PDList instance = new PDList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEmpty method, of class PDList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PDList instance = new PDList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class PDList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        PDList instance = new PDList();
        instance.add(e);
        
    }

    /**
     * Test of iterator method, of class PDList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        PDList instance = new PDList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        
        
    }

    /**
     * Test of addAll method, of class PDList.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Object c = null;
        PDList instance = new PDList();
        instance.add(c);
        
    }

    private Iterator inkedList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
