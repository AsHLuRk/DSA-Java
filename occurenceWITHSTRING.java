
import java.util.*;
public class occurenceWITHSTRING{
    public static void main(Stringtest arg[]){
       Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      System.out.print("Tell the occurence of: ");
      int y = scn.nextInt();
      Stringtest value = y+"";
      Stringtest number = n+"";
      int count=0;
      for(int i =0; i<number.length();i++){
        if((number.charAt(i)==value.charAt(0))){
 count++;
        }
      }
      System.out.println("Occurrence is: "+count);
    }
}