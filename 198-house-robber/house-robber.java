class Solution {
    public int rob(int[] nums) {
     int[] dp = new int[nums.length];
    if(nums.length==1){
        return nums[0];
    }
    if(nums.length==2){
       return Math.max(nums[0], nums[1]);
    }
     int a = 0;
     int b = 0;
     int ans=0;

     for(int i=0; i<nums.length; i++){
        ans = Math.max(a+nums[i], b);
        a =b;
        b=ans;
     }

     return ans;

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