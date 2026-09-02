class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        
         int[] dp = new int[cost.length+1];
         Arrays.fill(dp , -1);
         return mincost(cost, dp , cost.length);
    }

    public int mincost(int[] cost , int[] dp, int n){

        if(n==0 || n==1){
            dp[n]=0;
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = Math.min(mincost(cost , dp , n-1)+cost[n-1], mincost(cost , dp ,n-2)+cost[n-2]);

        return dp[n];
    }

}