class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length()+1][s2.length()+1];
    
        dp[0][0] = 0;
        for(int i=1; i<=s.length(); i++){
            for(int j=1; j<=s2.length(); j++){
            int matching =0;
            if(s.charAt(i-1)==s2.charAt(j-1)){
                matching = dp[i-1][j-1]+1;
            }
            int not_matching =0;
            if(s.charAt(i-1)!=s2.charAt(j-1)){
                 not_matching = Math.max(dp[i][j-1], dp[i-1][j]);
            }
            dp[i][j] = Math.max(matching , not_matching);
            }
        }
        return dp[s.length()][s2.length()];
    }
  public int ans(String s1 , String s2 , int a , int b, int[][] dp){
        if(a<0 || b<0){
            return 0;
        }
        if(dp[a][b]!=-1){
            return dp[a][b];
        }
        int matching = 0;
        if(s1.charAt(a)==s2.charAt(b)){
         matching = ans(s1, s2, a-1 , b-1, dp)+1;
        }
        int not_matching = 0;
        if(s1.charAt(a)!=s2.charAt(b)){
         not_matching = Math.max(ans(s1, s2 , a-1, b,dp), ans(s1, s2, a,b-1,dp));
        }
        dp[a][b] = Math.max(matching , not_matching);
        return dp[a][b];
    }
}