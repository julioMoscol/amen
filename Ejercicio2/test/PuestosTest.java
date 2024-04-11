/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliomoscol
 */
public class PuestosTest {
    
    Puestos puesto1, puesto2, puesto3, puesto4;
    
    public PuestosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        puesto1 = new Puestos("Gerente de TI", 13000, 0.04, 12480);
        puesto2 = new Puestos("Arquitecto Cloud", 11000, 0.05, 10450);
        puesto3 = new Puestos("Desarrollador", 9000, 0.06, 8460);
        puesto4 = new Puestos("Analista", 7000, 0.07, 6510);
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sueldoNetoxPuesto method, of class Puestos.
     */
    @Test
    public void testSueldoNetoxPuesto1() {
        assertTrue(puesto1.sueldoNetoxPuesto()==12480);
    }
    
    @Test
    public void testSueldoNetoxPuesto2() {
        assertTrue(puesto1.sueldoNetoxPuesto()!=12280);
        
    }
    
    @Test
    public void testSueldoNetoxPuesto3() {
        assertTrue(puesto2.sueldoNetoxPuesto()==10450);
    }
    
    @Test
    public void testSueldoNetoxPuesto4() {
        assertTrue(puesto2.sueldoNetoxPuesto()!=10460);
    }
    
    @Test
    public void testSueldoNetoxPuesto5() {
        assertEquals(puesto3.sueldoNetoxPuesto(), 8460, 0.00);
    }
    
    @Test
    public void testSueldoNetoxPuesto6() {
        assertEquals(puesto3.sueldoNetoxPuesto(), 8460, 0.00);
    }
    
    @Test
    public void testSueldoNetoxPuesto7() {
        assertEquals(puesto4.sueldoNetoxPuesto(), 6510, 0.00);
    }
    
    @Test
    public void testSueldoNetoxPuesto8() {
        assertEquals(puesto4.sueldoNetoxPuesto(), 6510, 0.00);
    }
    
}
