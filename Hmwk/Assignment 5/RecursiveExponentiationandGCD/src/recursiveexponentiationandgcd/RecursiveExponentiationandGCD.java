package recursiveexponentiationandgcd;

// Import Libraries
import java.util.Scanner;

public class RecursiveExponentiationandGCD {

    public static void main(String[] args) {
    // Main code
        // Variables
        Scanner input = new Scanner(System.in);
        int exp=0;
        int base=0;
        int x=0;
        int y=0;        
        
        System.out.println("Enter an integer value for the base: ");
        base = input.nextInt();
        System.out.println("Enter an integer value for the exponent: ");
        exp = input.nextInt();
        
        for(int i =0;i<=exp;i++){
            System.out.printf("base %d to the %d is equal to ",base, i);
            System.out.println(integerPower(base, i));
        }
        
        System.out.println("Enter an integer value for value one: ");
        x = input.nextInt();
        System.out.println("Enter an integer value for value two: ");
        y = input.nextInt();
        
        System.out.println("the GCD of "+x+" and "+y+" is "+GCD(x,y));
        
        
    }
    // Methods
    
 public static int integerPower(int base, int exp){
     if (exp == 0) return 1; 
     else return base * integerPower(base, exp - 1);
 }
 
 public static int GCD(int x, int y){
     if(y == 0) return x;
     return GCD(y,(x%y));
 }
 // End of Method's List
}

    
