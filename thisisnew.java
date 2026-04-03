import java.util.Scanner;

public class thisisnew {

    public static void main(Stringtest[] args) {
        System.out.println(fact(12));
     
        }
    
    public static int fact(int n){
     if(n==1){
        return 1;
     }
     int ans = n*fact(n-1);
     return ans;
        
    }

    }
