class Solution {
    public boolean isPalindrome(int x) {
         StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        String rev = sb.toString();
        boolean ans = false;
        if(rev.equals(String.valueOf(x))){
          ans = true;
        }else{
           ans = false;
        }
     return ans;
    }
}