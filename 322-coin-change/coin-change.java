class Solution {
    public int coinChange(int[] coins, int amount) {
       int[][] dp = new int[coins.length+1][amount+1];
       dp[0][0] = 0;
       for(int i=1; i<=amount; i++){
       dp[0][i] = Integer.MAX_VALUE;
       }
       for(int i=1;i<=coins.length; i++){
        for(int j=1; j<=amount; j++){
            int pick = Integer.MAX_VALUE;
            if(coins[i-1]<=j){
                int sub = dp[i][j-coins[i-1]];
                if(sub<Integer.MAX_VALUE){
                    pick = sub+1;
                }
            }
            int nopick = dp[i-1][j];
            dp[i][j]= Math.min(pick, nopick);
        }
       }
       return (dp[coins.length][amount])<Integer.MAX_VALUE?dp[coins.length][amount]:-1;
    //    int check = ans(coins , amount , coins.length-1, dp);
    //    return (check<Integer.MAX_VALUE)?check:-1;
    }

    public int ans(int[] coins , int amount, int n, int[][] dp){
    if(amount==0){
        return 0;
    }
    if(n<0){
        return Integer.MAX_VALUE;
    }

    if(dp[n][amount]!=-1){
        return dp[n][amount];
    }
    int pick = Integer.MAX_VALUE;
    if(coins[n]<=amount){
       int sub = ans(coins,amount-coins[n], n,dp);
       if(sub<Integer.MAX_VALUE){
        pick = sub+1;
       }
    }
    int nopick = ans(coins , amount, n-1,dp);
    dp[n][amount]=Math.min(pick,nopick);
    return dp[n][amount];
    }
   
}