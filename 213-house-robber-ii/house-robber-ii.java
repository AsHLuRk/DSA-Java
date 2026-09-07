class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int a= ans(0,nums.length-2, dp , nums);
        Arrays.fill(dp, -1);
        int b = ans(1, nums.length-1, dp , nums);
        return Math.max(a,b);
    }

     public int ans(int s,int n , int[] dp, int[] nums){

        if(n==s){

            return nums[s];
        }
        if(n==s+1){
          return Math.max(nums[s], nums[s+1]);
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = Math.max(nums[n]+ans(s,n-2,dp,nums), ans(s,n-1,dp,nums));
        return dp[n];
    }
}