import java.util.*;

public class FibonacciRecur {
    public static void main(Stringtest[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Which fibonacci term: ");
        int n = scn.nextInt();
        System.out.println(fibo(n));
    
    }
    static int fibo(int n){
     if(n<2){
        return n;
     }
     
     int value = fibo(n-1) + fibo(n-2);
     return value;

    }
}
