class Solution {
    public int rob(int[] nums) {
     int[] dp = new int[nums.length];
    if(nums.length==1){
        return nums[0];
    }
    if(nums.length==2){
       return Math.max(nums[0], nums[1]);
    }
     dp[0] = nums[0];
     dp[1] = Math.max(nums[0],nums[1]);

     for(int i=2; i<nums.length; i++){
        dp[i] = Math.max(nums[i]+dp[i-2], 0+dp[i-1]);
     }
     return dp[nums.length-1];

    //  Arrays.fill(dp,-1);
    //  return ans(nums.length-1, nums , dp);
    // }
    // public int ans(int n, int[] nums, int[] dp){
    //     if(n<0){
    //         return 0;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n] = Math.max(nums[n]+ans(n-2,nums,dp), 0+ans(n-1,nums,dp));
    //     return dp[n];
    }
}