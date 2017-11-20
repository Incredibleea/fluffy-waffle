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
public class KalkulatorTest {
    
    public KalkulatorTest() {
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
     * Test of dodaj method, of class Kalkulator.
     */
    @Test
    public void testDodaj() {
        System.out.println("dodaj");
        Integer[] args = {4,5,6,7};
        Kalkulator instance = new Kalkulator();
        int expResult = 22;
        int result = instance.dodaj(args);
        assertEquals(expResult, result);
    }

    /**
     * Test of odejmij method, of class Kalkulator.
     */
    @Test
    public void testOdejmij() {
        System.out.println("odejmij");
        int a = 6;
        int b = 2;
        Kalkulator instance = new Kalkulator();
        int expResult = 4;
        int result = instance.odejmij(a, b);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("Kalkulator.odejmij fail.");
    }

    /**
     * Test of pomnoz method, of class Kalkulator.
     */
    @Test
    public void testPomnoz() {
        System.out.println("pomnoz");
        int a = 0;
        int b = 7;
        Kalkulator instance = new Kalkulator();
        int expResult = 0;
        int result = instance.pomnoz(a, b);
        assertEquals(expResult, result);
        for ( int i = 0 ; i < 1012 ; i++ ) {
            result = instance.pomnoz(i, 6);
            expResult = i * 6;
            assertEquals(expResult, result);
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMultiply() {
        System.out.println("Twoj stary");
        Kalkulator instance = new Kalkulator();
        int expResult = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 4 * 5;
        int result = instance.dodaj(1,2,3,4,5,6,7) + instance.pomnoz(4, 5);
        assertEquals(expResult, result);
        
    }
    
}
