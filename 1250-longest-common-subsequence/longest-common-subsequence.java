class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for(int[] arr:dp){
            for(int i=0; i<arr.length;i++){
                arr[i] = -1;
            }
        }
        return ans(text1, text2, text1.length()-1 , text2.length()-1, dp);
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