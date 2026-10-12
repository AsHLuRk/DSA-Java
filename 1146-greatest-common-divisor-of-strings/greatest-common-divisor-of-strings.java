class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s = "";
        String ans = "";
        if(str1.equals(str2)){
            return str1;
        }
        for(int i=0; i<str1.length(); i++){
            s = s+str1.charAt(i);
         
            if(str1.replace(s,"").equals("")&&str2.replace(s,"").equals("")){
            ans = s;
            }
        }
        return ans;
    }
}