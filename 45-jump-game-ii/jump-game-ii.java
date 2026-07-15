class Solution {
    public int jump(int[] nums) {
        
        if(nums.length==1){
            return 0;
        }
        
        int max_index =0;
        int currend = 0;
        int count = 0;

       for(int i=0; i<nums.length; i++){
        max_index = Math.max(max_index , nums[i]+i);

        if(i==currend){
            count++;
            currend = max_index;
            if(currend>=nums.length-1)break;
        }

       }
        return count;
    }
}