class Solution {
    
    public int climbStairs(int n) {

        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n+1, -1));
        return ans(n ,dp);
    }
    public int ans(int n, ArrayList<Integer> dp){
        if(n<=1){
            return 1;
        }
        if(dp.get(n)!=-1){
            return dp.get(n);
        }
         dp.add(n , ans(n-1,dp)+ans(n-2,dp));
         return dp.get(n);

    }
}