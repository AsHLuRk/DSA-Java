class Solution {
    public int minOperations(int[] nums) {
        
        boolean isIncreasing = false;
        int inc_count = 0;
        for(int i=0; i <nums.length-1; i++){
            if((nums[i]+1)%nums.length==nums[i+1]){
                inc_count++;
            }
        }
        if(inc_count==nums.length-1){
            isIncreasing = true;
        }
        if(isIncreasing && nums[0]==0 && nums[nums.length-1]==nums.length-1){
            return 0;
        }
        if(isIncreasing){
        return Math.min((nums.length-nums[0]), nums[nums.length-1]+3);
        }
        boolean isDecreasing = false;
        int int_dec = 0;
        for(int i=1; i<nums.length; i++){

            if(nums[i-1]==(nums[i]+1)%nums.length){
                int_dec++;
            }
        }
        if(int_dec==nums.length-1){
            isDecreasing=true;
        }
        if(!isDecreasing){
            return -1;
        }
        if(nums[0]==nums.length-1 && nums[nums.length-1]==0){
            return 1;
        }
        return Math.min((nums.length-nums[nums.length-1])+1, ((nums[0]+1)%nums.length+1));

    }
}