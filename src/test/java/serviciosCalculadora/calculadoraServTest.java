/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package serviciosCalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mafe
 */
public class calculadoraServTest {
    
    public calculadoraServTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class calculadoraServ.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num1 = 5;
        double num2 = 2;
        calculadoraServ instance = new calculadoraServ();
        double expResult = 7;
        double result = instance.suma(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class calculadoraServ.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = 5;
        double num2 = 1;
        calculadoraServ instance = new calculadoraServ();
        double expResult = 4;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0);
       
      
    }

    /**
     * Test of div method, of class calculadoraServ.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        double num1 = 10;
        double num2 = 5;
        calculadoraServ instance = new calculadoraServ();
        double expResult = 2;
        double result = instance.div(num1, num2);
        assertEquals(expResult, result, 0);
       
       
    }

    /**
     * Test of multi method, of class calculadoraServ.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        double num1 = 5;
        double num2 = 2;
        calculadoraServ instance = new calculadoraServ();
        double expResult = 10;
        double result = instance.multi(num1, num2);
        assertEquals(expResult, result, 0);
      
     
    }
    
}
