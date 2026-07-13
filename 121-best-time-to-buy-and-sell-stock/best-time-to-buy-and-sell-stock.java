class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice =prices[0];
        int maxprof =0;

        for(int i=1; i<prices.length; i++){
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