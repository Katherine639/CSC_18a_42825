
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    
    public FractionTest() {
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
     * Test of getNumerator method, of class Fraction.
     */
    
    @Test
    public void testEquals()
    {
        System.out.println("test equals method");
        Fraction instance = new Fraction(1,6);
        Fraction f2 = new Fraction(1,6);
        assertEquals(true,instance.equals(f2));
    }
    
    @Test 
    public void testCopyConstructor()
    {
        System.out.println("test copy constructor");
        Fraction instance = new Fraction(1,6);
        Fraction f2 = new Fraction(instance);
        assertEquals(true,instance.equals(f2));
    }
    
    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        Fraction instance = new Fraction(1,4);
        int expResult = 1;
        int result = instance.getNumerator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumerator method, of class Fraction.
     */
    @Test
    public void testSetNumerator() {
        System.out.println("setNumerator");
        int newNumerator = 1;
        Fraction instance = new Fraction(1,4);
        instance.setNumerator(newNumerator);
        int actualValue = instance.getNumerator();
        assertEquals(newNumerator,actualValue);
    }

    /**
     * Test of getDenominator method, of class Fraction.
     */
    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        Fraction instance = new Fraction(1,4);
        int expResult = 4;
        int result = instance.getDenominator();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDenominator method, of class Fraction.
     */
    @Test
    public void testSetDenominator() {
        System.out.println("setDenominator");
        int newDenominator = 1;
        Fraction instance = new Fraction(1,4); // fraction is 1/4
        instance.setDenominator(newDenominator);
        int actualValue = instance.getDenominator();
        assertEquals(newDenominator,actualValue);
    }

    /**
     * Test of value method, of class Fraction.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Fraction instance = new Fraction(1,4);
        double expResult = 0.25;
        double result = instance.value();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Fraction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fraction instance = new Fraction(1,4);
        String expResult = "1 / 4";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }

    /**
     * Test of add method, of class Fraction.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(4,7); // 4/7
        Fraction result = instance.add(f2);
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testAdd2() {
        System.out.println("add2");
        Fraction f2 = new Fraction(32,58); // 32/58
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(199,203); // 199/203
        Fraction result = instance.add(f2);
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testAdd3() {
        System.out.println("test static Fraction.add");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction f1 = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(4,7); // 4/7
        Fraction result = Fraction.add(f1,f2); // invoke static add
        System.out.println("....."+result.toString());
        assertEquals(true, result.equals(expResult));        
    }
    
    /**
     * Test of subtract method, of class Fraction.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(2,7); // 2/7
        Fraction result = instance.subtract(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("subtract");
        Fraction f2 = new Fraction(1,12); // 1/12
        Fraction instance = new Fraction(387,388); // 3/7
        Fraction expResult = new Fraction(266,291); // 266/291
        Fraction result = instance.subtract(f2);
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testSubtract3() {
        System.out.println("test Fraction.subtract");
        Fraction f2 = new Fraction(1,12); // 1/12
        Fraction f1 = new Fraction(387,388); // 3/7
        Fraction expResult = new Fraction(266,291); // 266/291
        Fraction result = Fraction.subtract(f1, f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    /**
     * Test of multiply method, of class Fraction.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(3,49);
        Fraction result = instance.multiply(f2);
        assertEquals(true, result.equals(expResult));        
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        Fraction f2 = new Fraction(1,20); // 1/20
        Fraction instance = new Fraction(10,37); // 10/37
        Fraction expResult = new Fraction(1,74);
        Fraction result = instance.multiply(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testMultiply3() {
        System.out.println("test Fraction.multiply2");
        Fraction f2 = new Fraction(1,20); // 1/20
        Fraction f1 = new Fraction(10,37); // 10/37
        Fraction expResult = new Fraction(1,74);
        Fraction result = Fraction.multiply(f1,f2);
        assertEquals(true, result.equals(expResult));        
    }
    /**
     * Test of divide method, of class Fraction.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Fraction f2 = new Fraction(1,7); // 1/7
        Fraction instance = new Fraction(3,7); // 3/7
        Fraction expResult = new Fraction(3,1);
        Fraction result = instance.divide(f2);
        assertEquals(true, result.equals(expResult));        
    }    
    
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Fraction f2 = new Fraction(3,40); // 3/40
        Fraction instance = new Fraction(30,97); // 30/97
        Fraction expResult = new Fraction(400,97);
        Fraction result = instance.divide(f2);
        assertEquals(true, result.equals(expResult));        
    }
    
    @Test
    public void testDivide3() {
        System.out.println("test Fraction.divide2");
        Fraction f2 = new Fraction(3,40); // 3/40
        Fraction f1 = new Fraction(30,97); // 30/97
        Fraction expResult = new Fraction(400,97);
        Fraction result = Fraction.divide(f1,f2);
        assertEquals(true, result.equals(expResult));        
    }
}
