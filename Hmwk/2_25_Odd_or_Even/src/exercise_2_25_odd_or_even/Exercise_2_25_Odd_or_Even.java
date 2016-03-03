/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2_25_odd_or_even;

/**
 *
 * @author Alfredo
 */
import java.util.Scanner;
public class Exercise_2_25_Odd_or_Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("enter an integer to test if it is even or odd: ");
        number = input.nextInt();
        
        int r = number%2;
        
        if (r == 0){
            System.out.printf("%d, is an even number.",number);
        }
        else{
            System.out.printf("%d, is an odd number.",number);
        }
        System.out.println();
        
    }
    
}
