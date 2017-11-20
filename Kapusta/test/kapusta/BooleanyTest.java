/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapusta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nowak_1105010
 */
public class BooleanyTest {
    
    public BooleanyTest() {
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
     * Test of or method, of class Booleany.
     */
    @Test
    public void testOr() {
        System.out.println("or");
        boolean a = false;
        boolean b = true;
        Booleany instance = new Booleany();
        boolean result = instance.or(a, b);
        assertTrue(result);
        assertFalse(instance.or(false,false));
        assertTrue(instance.or(true,true));
        assertTrue(instance.or(true,false));
    }
    
}
