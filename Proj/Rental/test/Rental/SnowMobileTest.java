package Rental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Date: 5/30/16
 * Session Time - Started: 10:29 am
 *              - Ended:  10:52 am
 * @author Alfredo
 */
public class SnowMobileTest {
    
    public SnowMobileTest() {
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
     * Test of getCapacity method, of class SnowMobile.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("\n**getCapacity");
        SnowMobile instance = new SnowMobile(true, 850.00, 474748, 5,"AY47Y");
        int expResult = 5;
        int result = instance.getCapacity();
        System.out.println("Expected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCapacity method, of class SnowMobile.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("\n**setCapacity");
        int capacity = 0;
        SnowMobile instance = new SnowMobile(true, 680.80, 54747, 2, "GT12");
        instance.setCapacity(3);
        int expResult = 3;
        int result = instance.getCapacity();
        System.out.println("\nExpected Resul:"+expResult+"\nResult:"+result);
        assertEquals(expResult,result);
    }

    /**
     * Test of getVIN method, of class SnowMobile.
     */
    @Test
    public void testGetVIN() {
        System.out.println("\n**getVIN");
        SnowMobile instance = new SnowMobile(false, 475.25, 858547, 4 ,"A6H5");
        String expResult = "A6H5";
        String result = instance.getVIN();
        System.out.println("\nExpected Result:"+expResult+"\n Result:"+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setVIN method, of class SnowMobile.
     */
    @Test
    public void testSetVIN() {
        System.out.println("\n**setVIN");
        String VIN = "";
        SnowMobile instance = new SnowMobile(false, 358.20, 291547, 2, "DF21");
        instance.setVIN("7GF1");
        String expResult = "7GF1";
        String result = instance.getVIN();
        System.out.println("\nExpected Result:"+expResult+"\nResult:"+result);
        assertEquals(expResult,result);
        
    }

    /**
     * Test of toString method, of class SnowMobile.
     */
    @Test
    public void testToString() {
        System.out.println("\n**toString");
        SnowMobile instance = new SnowMobile(false, 358.20, 291547, 2, "DF21");
        String expResult = "Is it a new model?: false"+
                "\nRental Number: 291547"+"\nVIN: DF21\nCapacity: 2"+
                "\nRental Cost: $ 358.20";
        String result = instance.toString();
        System.out.println("\nExpected result:"+expResult+"\nResult:"+result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lateCharge method, of class SnowMobile.
     */
    @Test
    public void testLateCharge() {
        System.out.println("\n**lateCharge");
        SnowMobile instance = new SnowMobile(true, 300, 7474154, 2, "J47H5");
        double expResult = 390;
        double result = instance.lateCharge();
        System.out.println("\nExpected Result:"+expResult+"\nresult:"+result);
        assertEquals(expResult,result, 0.0001);
    }
    
}
