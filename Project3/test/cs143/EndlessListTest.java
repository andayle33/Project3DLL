/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs143;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coach
 */
public class EndlessListTest {
    private EndlessList test;
    
    public EndlessListTest() {
    }
    
    
    @Before
    public void setUp() throws Exception {
         test = new EndlessList();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addPrev method, of class EndlessList.
     */
    @Test
    public void testAddPrev() throws Exception {     
 if((test.getNext()==null)&&(test.getPrev()==null))
      test.addPrev(this);
    }

    /**
     * Test of addNext method, of class EndlessList.
     */
    @Test
    public void testAddNext() {
        System.out.println("addNext");
        Object value = null;
        EndlessList instance = new EndlessList();
        instance.addNext(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class EndlessList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        EndlessList instance = new EndlessList();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class EndlessList.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        EndlessList instance = new EndlessList();
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class EndlessList.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        EndlessList instance = new EndlessList();
        boolean expResult = false;
        boolean result = instance.setValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrev method, of class EndlessList.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        EndlessList instance = new EndlessList();
        Object expResult = null;
        Object result = instance.getPrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class EndlessList.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        EndlessList instance = new EndlessList();
        instance.addNext("boss");
        instance.addNext("floss");
        instance.addNext("cost");
        Object expResult = "cost";
        Object result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveToNext method, of class EndlessList.
     */
    @Test
    public void testMoveToNext() {
        System.out.println("moveToNext");
        Object value = null;
        EndlessList instance = new EndlessList();
        boolean expResult = false;
        boolean result = instance.moveToNext(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveToPrev method, of class EndlessList.
     */
    @Test
    public void testMoveToPrev() {
        System.out.println("moveToPrev");
        Object value = null;
        EndlessList instance = new EndlessList();
        boolean expResult = false;
        boolean result = instance.moveToPrev(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class EndlessList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        EndlessList instance = new EndlessList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
