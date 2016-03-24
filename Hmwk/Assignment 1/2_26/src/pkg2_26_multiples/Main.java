/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_26_multiples;

/**
 *
 * @author Alfredo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,r;
        System.out.print("enter an integer to test if it is a multiple of the second number: ");
        a = input.nextInt();
        System.out.print("enter an integer to test agianst: ");
        b = input.nextInt();
        System.out.println();
        
        r = a%b;
        
        if (r == 0){
            System.out.printf("%d is a multiple of %d", a, b );
        }
        else{
            System.out.printf("%d is not a multiple of %d.", a, b );
        }
        System.out.println();
        
    }
    
}
