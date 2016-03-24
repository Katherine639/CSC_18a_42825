/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powandgcd;

/**
 *
 * @author Alfredo
 */
import java.util.Scanner;
public class PowAndGcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(integerPow(3,4));
        //System.out.println(gcd(1543416,144));
        Scanner input = new Scanner(System.in);
        System.out.println("            Exponentiation and GCD            ");
        System.out.println("------------------------------------------------");
        System.out.println("Exponentaion:");       
        //Ask user for inputs.
        System.out.println("Enter a integer value for the base: ");
        int base = input.nextInt();        
        System.out.println("Enter an integer value for the exponent: ");
        int exp = input.nextInt();
        System.out.println();
        //Calculate the expression.
        System.out.println(base+" to the "+exp+" is "+integerPower(base,exp));
        System.out.println();
        
        System.out.println("GCD:");
        //input for GCD.
        System.out.println("Enter a integer value for the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter an integer value for the second number: ");
        int num2 = input.nextInt();
        System.out.println();
        //Calculate the GCD
        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
        System.out.println();
        
    }
    public static int integerPower(int base, int exp){
        int total = 1;
        if(exp > 0)
        {
            for(int i = 1 ; i <= exp ; i++){
                total *= base;
            }
        } 
        else{
            for(int i = -1 ; i >= exp ; i--)
            {
                total /= base;
            }
    }
        return total;
    }
    public static int gcd(int number1, int number2){
        int i = number1;
        int j = number2;
        while (i != j){
            if (i > j){
                i = i - j;
            }
            else{
                j = j - i;
            }
        }
        return i;
    }
}
