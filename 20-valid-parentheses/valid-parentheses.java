class Solution {
    public boolean isValid(String s) {
        Stack<Character> paren = new Stack<>();
        if(s.length()<=1){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
              paren.push(s.charAt(i));
            }
            if(s.charAt(i)==')' || s.charAt(i)=='}'|| s.charAt(i)==']'){
                if(paren.isEmpty()){
                    return false;
                }
                char curr = paren.pop();
                if(s.charAt(i)==')' && curr!='('){
                    return false;
                }
                if(s.charAt(i)==']' && curr!='['){
                    return false;
                }
                 if(s.charAt(i)=='}' && curr!='{'){
                    return false;
                }
            }
        }

        return (paren.size()!=0)?false:true;
    }
}