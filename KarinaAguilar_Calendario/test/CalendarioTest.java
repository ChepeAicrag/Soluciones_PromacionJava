/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author García García José Ángel
 */
public class CalendarioTest {
    
    public CalendarioTest() {
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
     * Test of isBisieto method, of class Calendario.
     */
    @Test
    public void testIsBisieto() {
        System.out.println("isBisieto");
        Calendario instance = null;
        boolean expResult = false;
        boolean result = instance.isBisieto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCalendario method, of class Calendario.
     */
    @Test
    public void testPrintCalendario() {
        System.out.println("printCalendario");
        Calendario instance = null;
        instance.printCalendario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHorizontal method, of class Calendario.
     */
    @Test
    public void testPrintHorizontal() {
        System.out.println("printHorizontal");
        Calendario instance = null;
        instance.printHorizontal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
