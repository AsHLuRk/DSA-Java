
import java.util.*;
public class subsetswithoutrecur {
    public static void main(String arg[]){

         int[] arr = {1,2,2};

         List<List<Integer>> ans = subsets(arr);

          for(List<Integer> ar1:ans){
            System.out.println(ar1);
          }

    }

    public static List<List<Integer>> subsets(int arr[]){


      List<List<Integer>> outer = new ArrayList<>();
      outer.add(new ArrayList<>());
     

      for(int num:arr){

          int n = outer.size();
          for(int i =0; i<n; i++){

        
          List<Integer> internal = new ArrayList<>(outer.get(i));

          internal.add(num);

          outer.add(new ArrayList<>(internal));

     
          }

      }
      
          return outer;


    }
}
