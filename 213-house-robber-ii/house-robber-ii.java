class Solution {
    public int rob(int[] nums) {



        
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        return Math.max(robs(nums, 0 , nums.length-2), robs(nums, 1, nums.length-1));
        
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        // for(int i=2; i<nums.length-1; i++){
        //     dp[i] = Math.max(nums[i]+dp[i-2], 0+dp[i-1]);
        // }
        // int ans1 = dp[nums.length-2];
        // dp[1] = nums[1];
        // dp[2] = Math.max(nums[1],nums[2]);
        // for(int i=3; i<nums.length; i++){
            
        //   dp[i] = Math.max(nums[i]+dp[i-2], 0+dp[i-1]);
        // }
        // int ans2 = dp[nums.length-1];

        // return Math.max(ans1 , ans2);
    }
  public int robs(int[] nums , int start , int end){
    int a =0;
    int b= 0;
    int ans = 0;
    for(int i=start ; i<=end; i++){
         ans = Math.max(a+nums[i], b);
         a = b;
         b = ans;
    }
    return ans;
  }
}