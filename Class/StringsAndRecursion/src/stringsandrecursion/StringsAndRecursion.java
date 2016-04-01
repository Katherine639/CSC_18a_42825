package stringsandrecursion;

import java.math.BigInteger;

public class StringsAndRecursion {

    public static void main(String[] args) {
        for(int n=1; n<=100;n++){
            System.out.println("The fibonacci value in the "+n+" term is: "+fibo(n));
        }
        int n=1;
        long f;
        long sum =0;
        do{
           f = fibo(n);
           if (f>4000000) break;
           if (f%2 == 0){
               sum+=f;
               System.out.println("......"+f);
               
           }
           n++;
        }while(true);
                
    }
    //START METHOD'S LIST 
    public static long add(long x,long y){
        return x+y;
    }
    public static long add(long x, long y, long z){
        return x+y+z;
    }
    public static float add(float x, float y){
        return x+y;
    }
    public static double fact(int n){
        //base case
        if (n==0||n==1) return 1;
        //recursive call
        return n*fact(n-1);
    }
    public static BigInteger fact(BigInteger n){
        //base case
        if (n.compareTo(BigInteger.ZERO)==0||n.compareTo(BigInteger.ONE)==0) return BigInteger.ONE;
        //recursive call
        return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
    public static BigInteger comb(long n, long r){
        return fact(BigInteger.valueOf(n)).divide(fact(BigInteger.valueOf(r)).multiply(fact(BigInteger.valueOf(n-r))));
    }
    public static long fibo(int n){
        if(n==1||n==2)return n;
        return fibo(n-1)+fibo(n-2);
    }
    //END METHOD'S LIST
}
/**
 * 
 * 
 * 
 * method overloading:functions/methods with the same name however it has 
 *      different parameter's i.e   
 *          public static long add(long x, long y) :: return long x+y;
 *          public static long add(long x, long y, long z) :: return x+y+z;
 *          public static float add(float x, float y) :: return x+y;
 *  the way the compiler handles this is by NAME MANGALING
 *          
 * ::Recursion Chapter 18::
 *  when a functions/method loops itself
 * base case or exit condition 
 * and recursive call (the function calling itself)
 * 
 * 
 * 
 */