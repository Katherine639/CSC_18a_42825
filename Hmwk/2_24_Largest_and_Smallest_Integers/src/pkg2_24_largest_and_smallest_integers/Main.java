
package pkg2_24_largest_and_smallest_integers;

/**
 *
 * @author Alfredo
 * Start: 9:00 am
 * finish: 9:57 am
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create new scanner
        Scanner input = new Scanner(System.in);
        
        int x,y,z;
        int sum,avg,prod;
        
        //Promt user to input 3 integers      
        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();
        System.out.print("Enter the third integer: ");
        z = input.nextInt();
        
        //calculate the sum, avg and prod of all three numbers
        sum = x+y+z;
        avg = sum/3;
        prod = x*y*z;
        
        //Display the results of sum, avg and prod
        System.out.print("The sum of the numbers you selected is: ");
        System.out.print(sum);
        System.out.println();
        
        System.out.print("The average of the number you selected is: ");
        System.out.print(avg);
        System.out.println();
        
        System.out.print("The product of the numbers you selected is:");
        System.out.print(prod);
        System.out.println();
        
        int min=0, mid=0, max=0;
        
        //test to find out max, mid and mid
        if (x > y && x > z) {
            max = x;
            if (y > z){
                mid = y;
                min = z;
            }
            else{
                mid = z;
                min = y;
            }
            
        }
       
        if (y > x && y > z) {
            max = y;
            if (x > z){
                mid = x;
                min = z;
            }
            else{
                mid = z;
                min = x;
            }            
        }
        if (z > y && z > x) {
            if (y > x){
                mid = y;
                min = x;
            }
            else{
                mid = x;
                min = y;
            }            
        }
        
        // display the result of the min, mid, max
        System.out.print("The mumbers from smallest to largest are:");
        System.out.printf("%d, %d, %d", min,mid,max);
        System.out.println();
    }
    
}
