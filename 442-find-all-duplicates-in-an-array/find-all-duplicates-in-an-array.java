class Solution {
  
    public List<Integer> findDuplicates(int[] nums) {
          int i =0;
          List<Integer> ans = new ArrayList<>();
     while(i<nums.length){ 
     int correct = nums[i]-1;
     if(nums[i]<=nums.length &&  nums[i]!=nums[correct]){
        
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
     }
     else{
        i++;
     }  
    }
    for(int j=0; j<nums.length; j++){
        if(nums[j]!=j+1){
            ans.add(nums[j]);
        }
    }
    return ans;
}
}