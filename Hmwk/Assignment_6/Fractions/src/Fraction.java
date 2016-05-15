
public class Fraction {

    // member variables (attributes, properties)
    private int numerator;
    private int denominator;
    
    // constructors
    public Fraction()
    {
        numerator=0;
        denominator=1;
    }
    
    public Fraction(int n, int d)
    {
        setNumerator(n);
        setDenominator(d);
        reduce();
    }
    
    // copy constructor
    public Fraction(Fraction source)
    {
        numerator=source.getNumerator();
        denominator=source.getDenominator();
    }
    
    // get/set methods for numerator and denominator
    public int getNumerator()
    {
        return numerator;
    }
    
    public void setNumerator(int newNumerator)
    {
        numerator=newNumerator;
        //reduce();
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public void setDenominator(int newDenominator)
    {
        if ( newDenominator==0 ) throw new IllegalArgumentException();
        if ( newDenominator<0 )
        {
            numerator = -numerator;
            denominator = -newDenominator;
            //reduce();
        }
        else {
            denominator=newDenominator;
            //reduce();
        }
    }
    
    // utility methods
    private static int gcd(int n, int d)
    {
        int a=n, b=d;
        while ( b != 0 )
        {
            int r = a % b;
            a=b;
            b=r;
        }
        return a;
    }
    
    private void reduce()
    {
        // reduces our fraction to reduced form if possible
        int _gcd=gcd(numerator,denominator); // find the gcd
        if ( _gcd!=0 )
        {
            numerator /= _gcd;
            denominator /= _gcd;
        }
    }
    
    // return decimal value of our fraction
    public double value()
    {
        return numerator / (double)denominator;
    }
    
    public boolean equals(Fraction f2)
    {
        return ( numerator==f2.getNumerator() && denominator==f2.getDenominator() );
    }
    
    @Override
    public String toString()
    {
        return numerator+" / "+denominator;
    }
    
    public Fraction add(Fraction f2)
    {
        int a = numerator; // numerator of our fraction object
        int b = denominator; // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        if ( b==d )
        {
            return new Fraction( a+c, b );
        }
        int _gcd = gcd(a*d+b*c,b*d);
        return new Fraction( (a*d+b*c)/_gcd, (b*d)/_gcd );
    }
    
    public Fraction subtract(Fraction f2)
    {
        int a = numerator; // numerator of our fraction object
        int b = denominator; // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        if ( b==d )
        {
            return new Fraction( a-c, b );
        }
        
        return new Fraction( a*d-b*c, b*d );
    }
    
    public Fraction multiply(Fraction f2)
    {
        //int a = numerator; // numerator of our fraction object
        //int b = denominator; // denominator of our fraction object
        //int c = f2.getNumerator(); // numerator of f2 argument
        //int d = f2.getDenominator(); // denominator of f2 argument
        
        //return new Fraction( a*c, b*d );
        return Fraction.multiply(this, f2);
    }
    
    public Fraction divide(Fraction f2)
    {
        int a = numerator; // numerator of our fraction object
        int b = denominator; // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        return new Fraction( a*d, b*c );
    }
    
    // implementation of static methods for add, subtract, multiply and divide
    public static Fraction add(Fraction f1, Fraction f2)
    {
        int a = f1.getNumerator(); // numerator of our fraction object
        int b = f1.getDenominator(); // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        if ( b==d )
        {
            return new Fraction( a+c, b );
        }
        int _gcd = gcd(a*d+b*c,b*d);
        return new Fraction( (a*d+b*c)/_gcd, (b*d)/_gcd );
    }
    
    public static Fraction subtract(Fraction f1, Fraction f2)
    {
        int a = f1.getNumerator(); // numerator of our fraction object
        int b = f1.getDenominator(); // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        if ( b==d )
        {
            return new Fraction( a-c, b );
        }
        
        return new Fraction( a*d-b*c, b*d );
    }
    
    public static Fraction multiply(Fraction f1, Fraction f2)
    {
        int a = f1.getNumerator(); // numerator of our fraction object
        int b = f1.getDenominator(); // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        return new Fraction( a*c, b*d );
    }
    
    public static Fraction divide(Fraction f1, Fraction f2)
    {
        int a = f1.getNumerator(); // numerator of our fraction object
        int b = f1.getDenominator(); // denominator of our fraction object
        int c = f2.getNumerator(); // numerator of f2 argument
        int d = f2.getDenominator(); // denominator of f2 argument
        
        return new Fraction( a*d, b*c );
    }
}
