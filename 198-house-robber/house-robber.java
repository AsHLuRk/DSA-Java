class Solution {
    public int rob(int[] nums) {

    if(nums.length==1){
        return nums[0];
     }
    if(nums.length==2){
        Math.max(nums[0], nums[1]);
     }
     if(nums.length==0){
        return 0;
     }
     int a = nums[0];
     int b = Math.max(a, nums[1]);
     int ans =0;


      for(int i=2; i<nums.length; i++){

        ans= Math.max(a+nums[i],b);
        a = b;
        b = ans;
      }
      return b;

    }
    // public int ans(int n , int[] dp, int[] nums){

    //     if(n==0){
    //         return nums[0];
    //     }
    //     if(n==1){
    //       return Math.max(nums[0], nums[1]);
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n] = Math.max(nums[n]+ans(n-2,dp,nums), ans(n-1,dp,nums));
    //     return dp[n];
    // }
}

