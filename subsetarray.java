import java.util.ArrayList;
import java.util.List;

public class subsetarray {
    
    

    public static void main(String arg[]){

        String a = "abc";
        System.out.println(subsets(a, "").toString());
    }

    public static ArrayList<String> subsets( String s, String p){

        if(s.isEmpty()){
            ArrayList<String> new1 = new ArrayList<>();
            new1.add(p);
            return new1;
        }
        ArrayList<String> right = subsets(s.substring(1), p);
        ArrayList<String> middle = subsets(s.substring(1), p+(s.charAt(0)+0));
        ArrayList<String> left = subsets(s.substring(1), p+s.charAt(0));
        left.addAll(right);
        left.addAll(middle);
        return left;
    }
}
