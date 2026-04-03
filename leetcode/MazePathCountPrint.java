package leetcode;
import java.util.*;
public class MazePathCountPrint {
    
    public static void main(String[] args) {

        int m =3;
        int n=2;
        System.out.println(ans("", m, n).toString());
        
    }

    public static List<String> ans(String s ,int m , int n){
      if(m==1&& n==1){
        List<String> n1 = new ArrayList<>();
        n1.add(s);
        return n1;
      }
      List<String> ans1 = new ArrayList<>();
     if(n>1){
      ans1.addAll(ans(s+'R',m,n-1));
     }
     if(n>1&& m>1){
        ans1.addAll(ans(s+'D', m-1,n-1));
     }
     if(m>1){
      ans1.addAll(ans(s+'B',m-1,n));
     }
   return ans1;
    }
}
