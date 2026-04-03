package advanceJava;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;

public class stream {
    public static void main(String arg[]){

        int[] a = {1,2,4,6,7,8,9,10};
        List<Integer> list = Arrays.stream(a).boxed().toList();
        System.out.println(list);

        List<Integer> new1= list.stream().filter(iseven()).collect(Collectors.toList()) ; 
         
        System.out.println(new1);;

       list =  list.stream().map(e->e*2).collect(Collectors.toList());
        System.out.println(list);
         
    }

        public static Predicate<Integer> iseven(){

            return i->i%2==0;
        }
}
