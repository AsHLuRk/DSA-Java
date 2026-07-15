class Solution {
    public boolean canJump(int[] nums) {
        
        int max_index=0;
        int i=0;

       while(i<=max_index){
        max_index =Math.max(max_index , nums[i]+i);

        if(max_index>=nums.length-1){
            return true;
        }
        i++;
       }
       return false;
    }
}