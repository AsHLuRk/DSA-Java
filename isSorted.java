import java.util.ArrayList;
import java.util.*;
public class isSorted {
    
    public static void main(Stringtest arg[]){
        int[] arr = {1,3,5,112,6,2,112,334,112};
        System.out.println(check(arr, 0,112));
    }
    static List check(int[] arr , int n , int target){
           
         List<Integer> list = new ArrayList<>();
          if(n>arr.length-1){
            return list;
          }
          
          if(arr[n]==target){
            list.add(n);
          }
     List<Integer> answer =  check(arr, n+1, target) ;
     list.addAll(answer);
     return list;

        
        
    }
}
