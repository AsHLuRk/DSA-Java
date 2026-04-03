import java.util.Scanner;

public class armstrong {
    public static void main(Stringtest arg[]){
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the number till you want to find the armstrong number: ");
     int n = scn.nextInt();
     for(int i=0; i<=n; i++){
     armstrongnum(i);
     }
     System.out.println(7/2);
    }


    static void armstrongnum(int n){
        int ans=0;
        int n1=n;
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        n=n1;
        while(n>0){
           int rem = n%10; 
           int cube =1;
           for(int i =0; i<count; i++){
          cube  = cube*rem;
           }
           ans = ans+cube;
           n=n/10;
        }
        if(ans == n1){
            System.out.println("Number "+n1 +" is Armstrong");
        }
      
       
    }
    
}
