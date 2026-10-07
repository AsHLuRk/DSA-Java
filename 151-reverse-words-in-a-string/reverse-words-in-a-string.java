class Solution {
    public String reverseWords(String s) {
        s= s.strip();
        String ans ="";
        String word = "";
        int i = s.length()-1;
        while(i>=0){
         if(s.charAt(i)!=' '){
            word = s.charAt(i)+word;
         }
         else{
            ans = ans+word+" ";
            while(s.charAt(i)==' '){
                i--;
            }
            i++;
            word = "";
         }
         i--;
        }
        ans = ans + word +" ";
        ans = ans.strip();
        return ans;
    }
}