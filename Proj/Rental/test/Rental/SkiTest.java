/**
 * Date: 5/29/16
 * Session Time 
 *      Start: 2:02 PM
 *      Paused: 4:00 PM
 *      Resumed 9:58 PM
 *      finished: 10:51 PM
 * @author Alfredo
 */
package Rental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SkiTest {
    
    public SkiTest() {
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
     * Test of Rental Methods
     */
    @Test
    public void testIsEqual(){
        System.out.println("**Equals");
        Ski instance = new Ski(false,45.10, 323232, 150);
        boolean expResult = false;
        boolean result = instance.equals(expResult);
        
        System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult, result);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNewModel(){
        System.out.println("**isNewModel");
        
        Ski instance = new Ski(true, 28.50, 43354, 140);
        boolean expResult = true;
        boolean result = instance.isNewModel();
        
         System.out.printf("Expected Result: %s\nResult: %s\n\n", expResult, result);
        
        assertEquals(expResult,result);
    }
    
    @Test
    public void testSetNewModel(){
        System.out.println("**setNewModel");
        
        Ski instance = new Ski(true, 28.50, 43354, 140);
        instance.setNewModel(false);
        
        boolean expResult = false;
        boolean result = instance.isNewModel();
        
         System.out.printf("Expected Result: %s\nResult: %s\n\n", 
                 expResult, result);
        
        assertEquals(expResult,result);
    }
    
    
    @Test
    public void testGetRentalCost(){
        System.out.println("**getRentalCost");
        
        Ski instance = new Ski(true, 95.25, 30491, 170);
        
        double expResult = 95.25;
        double result = instance.getRentalCost();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", 
                expResult, result);
        
        assertEquals(expResult,result, 0.0001);
    }
       
    @Test
    public void testSetRentalCost(){
        System.out.println("**setRentalCost");
        
        Ski instance = new Ski(true, 32.50, 43424, 140);
        instance.setRentalCost(61.22);
        
        double expResult = 61.22;
        double result = instance.getRentalCost();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", 
                expResult, result);
        
        assertEquals(expResult,result, 0.0001);
    }
       
    @Test
    public void testGetRentalNumber(){
        System.out.println("**getRentalNumber");
        
        Ski instance = new Ski(false, 125.99, 218582, 155);
      
        long expResult = 218582;
        long result = instance.getRentalNumber();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expResult, result);
        
        assertEquals(expResult,result);
    
    
    }
     
    @Test
    public void testSetRentalNumber(){
        System.out.println("**setRentalNumber");
        
        Ski instance = new Ski(false, 125.99, 314852, 155);
        instance.setRentalNumber(120502);
      
        long expResult = 120502;
        long result = instance.getRentalNumber();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", 
                expResult, result);
        
        assertEquals(expResult,result);
    
    
    }
    /**
     * End of test of Rental Class..
     */
    
    /**
     * Test of lateCharge method, of class Ski.
     */
    @Test
    public void testLateCharge() {
        System.out.println("**lateCharge");
        Ski instance = new Ski(true, 40.00, 2947647,120);
        double expResult = 44;
        double result = instance.lateCharge();
        
        System.out.printf("Expected Result: %.2f\nResult: %.2f\n\n", expResult, 
                result);
        
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getSize method, of class Ski.
     */
    @Test
    public void testGetSize() {
        System.out.println("**getSize");
        Ski instance = new Ski(false,43.21, 12345, 111);
        int expResult = 111;
        int result = instance.getSize();
        
        System.out.printf("Expected Result: %d\nResult: %d\n\n", expResult, result);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSize method, of class Ski.
     */
    @Test
    public void testSetSize() {
        System.out.println("**setSize");
        int size = 81;
        Ski instance = new Ski(true, 120.42, 846846, 38);
        instance.setSize(size);
        System.out.printf("Expected Result: %d\nResult: %d\n\n", size, instance.getSize());
        assertEquals(size, instance.getSize());
    }

    /**
     * Test of toString method, of class Ski.
     */
     @Test
     public void testToString() {
        System.out.println("**toString");
        Ski instance = new Ski(false, 36.74, 698410, 75);
        String expResult = "New Model: false\nRental Cost: 36.74\n"
                + "Rental Number: 698410\nSize: 75 cm\n";
        String result = instance.toString();
        
        System.out.println(result);
        
        assertEquals(expResult, result);
    }
    
}
