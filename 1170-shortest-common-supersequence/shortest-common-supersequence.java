class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
    
    int[][] dp = lcc(str1 , str2);

    int i=dp.length-1;
    int j=dp[0].length-1;
    String ans = "";
    while(i>0 && j>0){

        if(str1.charAt(i-1)==str2.charAt(j-1)){
            ans = ans + str1.charAt(i-1);
            i--;
            j--;
        }
        else{

            if(dp[i-1][j]>dp[i][j-1]){
            ans = ans+str1.charAt(i-1);
            i--;
            }
            else{
            ans = ans+str2.charAt(j-1);
            j--;
            }
        }
    }
    while(i>0){
        ans = ans+str1.charAt(i-1);
        i--;
    }
    while(j>0){
        ans = ans+str2.charAt(j-1);
        j--;
    }
    return new StringBuilder(ans).reverse().toString();
    }

  public int[][] lcc(String text1 , String text2){
    int[][] dp = new int[text1.length()+1][text2.length()+1];
   
        dp[0][0] = 0;
        for(int i=1; i<=text1.length(); i++){
            for(int j=1; j<=text2.length(); j++){
            int matching =0;
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                matching = dp[i-1][j-1]+1;
            }
            int not_matching =0;
            if(text1.charAt(i-1)!=text2.charAt(j-1)){
                not_matching = Math.max(dp[i][j-1], dp[i-1][j]);
            }
            dp[i][j] = Math.max(matching , not_matching);
            }
        }
        return dp;
  }
}