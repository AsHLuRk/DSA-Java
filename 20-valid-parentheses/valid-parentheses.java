class Solution {
    public boolean isValid(String s) {
        Stack<Character> q = new Stack<>();
        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']' || s.length()<=1){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                q.push(s.charAt(i));
            }
            else if((s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']') && q.size()>0 ){
                char c = q.pop();
                if(s.charAt(i)==')' && c=='('){
                    continue;
                }
                else if(s.charAt(i)=='}' && c=='{'){
                    continue;
                }
                else if(s.charAt(i)==']' && c=='['){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

        }
        if(q.size()==0){
        return true;
        }
        else{
            return false;
        }
    }
}