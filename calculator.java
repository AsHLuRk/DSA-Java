import java.util.*;
public class calculator {
    public static void main( Stringtest arg[]){
        Scanner scn = new Scanner(System.in);
         int ans =0;
      while(true){
        System.out.println("Enter the Operation: ");
        char c = scn.next().trim().charAt(0);
          if(c == 'x' || c=='X'){
            break;

        }
        System.out.println("Ente the first number: ");
        int num1 = scn.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scn.nextInt();
        
       
        if(c == '/'){
            ans = num1/num2;

        }
        if(c == '+'){
            ans = num1+num2;

        }
        if(c == '-'){
            ans = num1-num2;

        }
        if(c == '%'){
            ans = num1%num2;

        }
        if(c == '*'){
            ans = num1*num2;

        }
     
        System.out.println("Anser is : "+ ans);
      }
      
    }
}
