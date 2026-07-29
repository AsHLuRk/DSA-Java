class Solution {
    public int rob(int[] nums) {
     int[] dp = new int[nums.length];
     Arrays.fill(dp,-1);
     return ans(nums.length-1, nums , dp);
    }
    public int ans(int n, int[] nums, int[] dp){

        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = Math.max(nums[n]+ans(n-2,nums,dp), 0+ans(n-1,nums,dp));
        return dp[n];
    }
}