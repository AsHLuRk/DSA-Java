class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice =Integer.MAX_VALUE;
        int maxprof =0;

        for(int i=0; i<prices.length; i++){
            int profit = prices[i]-minprice;
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            if(profit>maxprof){
                maxprof = profit;
            }
        }
      return maxprof;
    }
}