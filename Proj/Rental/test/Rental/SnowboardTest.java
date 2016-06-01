package Rental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Date: 5/30/16
 * Session Time - Started: 9:50 am
 *              - Ended:  10:28 am
 * @author Alfredo
 */
public class SnowboardTest {
    
    public SnowboardTest() {
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
     * Test of getSize method, of class Snowboard.
     */
    @Test
    public void testGetSize() {
        System.out.println("**getSize");
        Snowboard instance = new Snowboard(true,75.00,614747,100,true);
        int expResult = 100;
        int result = instance.getSize();
        System.out.println("\nExpecteded:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSize method, of class Snowboard.
     */
    @Test
    public void testSetSize() {
        System.out.println("**setSize");
        int size = 0;
        Snowboard instance = new Snowboard(false, 84.40, 586258, 120, false);
        instance.setSize(250);
        int expResult = 250;
        int result = instance.getSize();
        System.out.println("\nExpected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of isFreeStyle method, of class Snowboard.
     */
    @Test
    public void testIsFreeStyle() {
        System.out.println("**isFreeStyle");
        Snowboard instance = new Snowboard(true, 48.52, 487958, 180, true);
        boolean expResult = true;
        boolean result = instance.isFreeStyle();
        System.out.println("\nExpected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setFreeStyle method, of class Snowboard.
     */
    @Test
    public void testSetFreeStyle() {
        System.out.println("**setFreeStyle");
        Snowboard instance = new Snowboard(true,68.70, 2038183, 160, true);
        
        boolean expResult = true;
        boolean result = instance.isFreeStyle();
        
        System.out.println("\nExpected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of lateCharge method, of class Snowboard.
     */
    @Test
    public void testLateCharge() {
        System.out.println("**lateCharge");
        Snowboard instance = new Snowboard(true, 200, 4874898, 280, false);
        double expResult = 240;
        double result = instance.lateCharge();
        System.out.println("\nExpected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of toString method, of class Snowboard.
     */
    @Test
    public void testToString() {
        System.out.println("**toString");
        Snowboard instance = new Snowboard(true, 68.40, 6841748, 250, true);
        
        String expResult = "Is it a new model?: true"+
                "\nRental Number: 6841748"+
                "\nSize: 250 cm\nFree Syle?: true"+
                "\nRental Cost: $ 68.40";
        String result = instance.toString();
        
        System.out.println("\nExpected Result:"+ expResult+ "\nResult:"+result);
        
        assertEquals(expResult, result);
    }
    
}
