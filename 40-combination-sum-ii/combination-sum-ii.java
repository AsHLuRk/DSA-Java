class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
      List<Integer> new1 = new ArrayList<>();
      List<List<Integer>> final1 = new ArrayList<>();
      Arrays.sort(candidates);
      ans(candidates , target ,0 , new1 , final1);
      return final1;
        
    }
    public void ans(int[] arr , int target , int start, List<Integer> new1, List<List<Integer>> final1){

        if(target==0){
            final1.add(new ArrayList<>(new1));
            return;
        }
         for(int i=start ; i<arr.length; i++){
           if(i>start && arr[i]==arr[i-1]){
            continue;
           }
           if(arr[i]>target){
            break;
           }
           else{
            new1.add(arr[i]);
            ans(arr , target -arr[i] , i+1 , new1 , final1);
            new1.remove(new1.size()-1);
           }
         }
        
    }
}