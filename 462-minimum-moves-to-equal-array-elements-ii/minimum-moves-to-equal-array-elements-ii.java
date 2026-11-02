class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median= 0;
        int ans = 0;
        if(nums.length%2!=0){
           median = nums[nums.length/2];
           for(int i=0;i<nums.length; i++){
            ans = ans + Math.abs(nums[i]-median);
           }
        }
        else{
            median = (nums[nums.length/2]+nums[(nums.length-1)/2])/2;
            int min = Integer.MAX_VALUE;
            int trueMedian = 0;
            for(int i=0; i<nums.length; i++){
            if(Math.abs(nums[i]-median)<min){
                trueMedian = nums[i];
                min = Math.abs(nums[i]-median);
            }
            }
            for(int i=0;i<nums.length; i++){
            ans = ans + Math.abs(nums[i]-trueMedian);
           }
        }
        return ans;
    }
}