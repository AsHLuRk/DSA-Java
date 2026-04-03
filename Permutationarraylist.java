import java.util.*;

public class Permutationarraylist {
 
    public static void main(String[] args) {
        
        String a = "123";
        ArrayList<String> new1 = ans("", a);
        System.out.println(new1.toString());
    }
    public static ArrayList<String> ans(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> emp = new ArrayList<>();
            emp.add(p);
            return emp;
        }

        ArrayList<String> f1 = new ArrayList<>();
        for(int i =0; i <=p.length(); i++){

          f1.addAll(ans(p.substring(i, p.length())+up.charAt(0)+p.substring(0,i), up.substring(1)));
        }
        return f1;

    }
}
