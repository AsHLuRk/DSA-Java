import java.util.*;
public class REVERSEnum{
  public static void main(Stringtest arg[]){
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n1 = scn.nextInt();
     Stringtest s1 = n1+"";
      Stringtest s2 = "";
     for(int i=s1.length()-1; i>=0;i--){
        s2 = s2+s1.charAt(i);
     }
     Integer num = Integer.valueOf(s2);
     int number = num;
       System.out.println(num);

  }
}