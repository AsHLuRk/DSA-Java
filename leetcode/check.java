package leetcode;

public class check {
    
    public static void main(String[] args) {
        String s ="123";
        ans("", s);
        
    }
    public static void ans(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        ans(p, up.substring(1));
        ans(p+up.charAt(0), up.substring(1));
        
    }
}
