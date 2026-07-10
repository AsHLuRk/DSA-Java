class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
      
        for(int i=0; i<=s.length()-10; i++){
            String subs = s.substring(i , i+10);

            if(set.contains(subs)){
                if(!ans.contains(subs)){
                    ans.add(subs);
                }
            }
            else{
                set.add(subs);
            }
        }
        return ans;
    }
}