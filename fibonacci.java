import java.util.*;
public class fibonacci{
    public static void main(Stringtest[] args) {
        int a =0;
        int b=1;
        int n;
        System.out.print("Fibonacci series till which term: ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(int i=0; i<=n;i++){
            if(i==n){
                System.out.println(a);
            }
            //  System.out.print(a+" ");
             int sum=a+b;
             a = b;
             b = sum;
        }
    }
}