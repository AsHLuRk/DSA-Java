import java.util.*;
public class reverseNUM2 {
    public static void main(Stringtest arg[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        int y =0;
        while(n>0){
            int rem = n%10;
            y = y+rem;
            if(n>10){
            y = y*10;}
            n = n/10;
        }
        System.out.println("Reverse of number: "+y);
    }
}
