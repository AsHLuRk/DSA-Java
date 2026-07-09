class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int allprof = 0;
        for(int i=0; i<prices.length; i++){
            int profit = prices[i]-buy;
            if(prices[i]<buy){
                buy = prices[i];
            }
            if(profit>0){
                allprof +=profit;
                buy = prices[i];
            }
        }
        return allprof;
    }
}