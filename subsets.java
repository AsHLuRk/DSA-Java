import java.util.ArrayList;

public class subsets {
    public static void main(String arg[]){

        int[] arr = {1,4,6,7};
        System.out.println(subs("", "abcd", new ArrayList<>()).toString());


    }
    public static ArrayList<String> subs(String a , String b, ArrayList<String> ss){

        if(b.isEmpty()){
            ss.add(a);
            return ss;
        }

        subs(a, b.substring(1), ss);
        subs(a+b.charAt(0), b.substring(1), ss);

        return ss;
    }
}
