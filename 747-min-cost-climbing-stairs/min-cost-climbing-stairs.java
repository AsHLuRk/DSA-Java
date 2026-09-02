class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        
        int a = 0;
        int b = 0; 
      
        for(int i=2; i<=cost.length; i++){
         
         
        int sum = Math.min(a+cost[i-2], b+cost[i-1]);
        a = b; 
        b = sum;
        }
      return b;
    }

    // public int mincost(int[] cost , int[] dp, int n){

    //     if(n==0 || n==1){
    //         dp[n]=0;
    //         return 0;
    //     }

    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n] = Math.min(mincost(cost , dp , n-1)+cost[n-1], mincost(cost , dp ,n-2)+cost[n-2]);

    //     return dp[n];
    // }

}