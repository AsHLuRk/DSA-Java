class Solution {
    public int change(int amount, int[] coins) {
      int[][] dp = new int[coins.length][amount+1];

      for(int[] arr:dp){
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }
      }
      return ans(coins , amount , coins.length-1,dp);
    }

    public int ans(int[] coins , int amount , int n, int[][] dp){
        if(amount==0){
            return 1;
        }
        if(n<0){
            if(amount ==0){
                return 1;
            }
            return 0;
        }
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }

        int pick =0;
        if(coins[n]<=amount){
            pick = ans(coins , amount-coins[n], n,dp);
        }
        int nopick = ans(coins, amount , n-1,dp);

        dp[n][amount] = pick+nopick;
        return dp[n][amount];
    }
}