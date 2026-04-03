import java.util.*;
public class SubsetsRecursive {
    public static void main(String[] args) {
        

 
}
 public static List<List<Integer>> subset(int[] arr, List<Integer> ans, List<List<Integer>> finalans , int a){
  if(a ==0){
    ans.add(null);
    finalans.add(ans);
    return finalans;
  }
  
  subset(arr , ans, finalans , a-1 ).add()
 }
     
}
