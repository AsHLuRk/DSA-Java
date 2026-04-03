package leetcode;

import javax.sql.rowset.spi.SyncResolver;

public class code151 {
    public static void main(String arg[]){
       String s = "Hello how    are you  ";
       String word ="";
       String ans = "";
       for(int i= s.length()-1; i>=0; i--){
        if(s.charAt(i)!=' '){
            word = s.charAt(i)+word;
        }
        if(i>0 && s.charAt(i)==' ' && s.charAt(i-1)!=' ' ){
        ans = ans +word +" ";
        word = "";
        }
       }
       ans = ans + word; 
       System.out.println(ans.trim());
    }
}
