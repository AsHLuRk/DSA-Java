class Solution {
    public int rob(int[] nums) {
      int[] dp = new int[nums.length+1];
      Arrays.fill(dp,-1);
      return ans(nums.length-1, dp , nums);
    }
    public int ans(int n , int[] dp, int[] nums){

        if(n==0){
            return nums[0];
        }
        if(n==1){
          return Math.max(nums[0], nums[1]);
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = Math.max(nums[n]+ans(n-2,dp,nums), ans(n-1,dp,nums));
        return dp[n];
    }
}

