import java.util.*;
public class occurenceIWITHOUTSTRING {
    public static void main(Stringtest arg[]){
        Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
    System.out.println("Enter the number whose occurence to found: ");
    int y = scn.nextInt();
    int count = 0;
    while(n>0){
        int rem = n%10;
        if(rem==y){
            count++;
        }
        n = n/10;
    }
    System.out.println("The number of Occurrence are: "+count);
    }
}
