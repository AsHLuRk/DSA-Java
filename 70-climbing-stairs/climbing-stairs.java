class Solution {
    public int climbStairs(int n) {
       if(n<=2){
        return n;
       }
        int[] dp = new int[n+1];
       
        dp[0] = 1;
        dp[1] = 2;

        for(int i=2 ; i<=n; i++){
           dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];

    }
    // public int ways(int n , int[] dp){

    //     if(n<=2){
    //         dp[n] = n;
    //         return n;
    //     }
    //     if(dp[n]!=0){
    //         return dp[n];
    //     }
    //     dp[n] = ways(n-1, dp)+ways(n-2,dp);
    //     return dp[n];
    // }
}