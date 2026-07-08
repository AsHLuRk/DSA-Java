class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int size = Integer.MAX_VALUE; 
       int sum =0;
       int k =0;
       for(int j=0; j<nums.length; j++){
       
        if(sum<target){
            sum+=nums[j];
            k++;
        }
        while(sum>=target){
             if(k<size){
                size =k;
            }
            sum = sum-nums[j-k+1];
            k--;
           }
         
       }
       return size == Integer.MAX_VALUE ? 0 : size;
    }
}