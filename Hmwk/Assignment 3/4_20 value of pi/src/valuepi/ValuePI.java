/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuepi;

/**
 *
 * @author Alfredo
 */
public class ValuePI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pi;
        double seq=0;
        for(int i=1;i<2000000000;i+=2){
            seq += ((1.0 / (2.0 * i - 1.0)) - (1.0 / (2.0 * i + 1)));
        }
        pi = 4 * seq;
        System.out.println(pi);
        // it takes about 2,000,000 iterations for it to begin with the value 
        // 3.14159
    }
    
}
