import java.util.Scanner;

public class prime {
    
    public static void main(Stringtest arg[]){
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int n = scn.nextInt();
          prime(n);

          
    }
       
    static void prime(int n){
         Boolean t = true;
       if(n<=1){
        t = false;
        
       }
       if(n%2==0||n%3==0){
        t = false;
       }

        for (int i = 5; i *i<=n; i = i + 6){
            if (n % i == 0 || n % (i + 2) == 0){
           t = false;
        }
       }
       if(t == false){
        System.out.println("Number is not prime");
       }
       else{
       System.out.println("Number is prime");
       }

    }
}
