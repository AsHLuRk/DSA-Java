class Solution {
    public List<String> generateParenthesis(int n) {
        return ans(n , 0 , 0 , new ArrayList<String>() , "");
    }

    public List<String> ans(int n , int open , int close , List<String> list, String s){

        if(open>n || close>n){
            return list;
        }
        if(close==n && open == n){
            if(validParenthesis(s)){
                list.add(s);
            }
        }

        ans(n , open+1, close , list , s+"(");
        ans(n , open , close+1, list , s+")");

        return list;
    }
    public boolean validParenthesis(String s){

        Stack<Character> paren = new Stack<>();
        if(s.length()<=1){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
              paren.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(paren.isEmpty()){
                    return false;
                }
                char curr = paren.pop();
                if(s.charAt(i)==')' && curr!='('){
                    return false;
                }
            }
        }

        return (paren.size()!=0)?false:true;
    }
    }
