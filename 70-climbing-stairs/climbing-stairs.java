class Solution {
    

    public int climbStairs(int n) {
       int[] memo = new int[n+1];
       Arrays.fill(memo, -1);
       return countstairs(n , memo);
    }
    public int countstairs(int n , int[] memo){
       if(n==1 || n==0){
        return 1;
       }
       if(memo[n]!=-1){
        return memo[n];
       }
       memo[n] = countstairs(n-1, memo) + countstairs(n-2, memo);
       return memo[n];
    }
}