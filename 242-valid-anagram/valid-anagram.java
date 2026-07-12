class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> map = new HashMap<>();
       if(s.length()!=t.length()){
        return false;
       }
       for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(!map.containsKey(c)){
            map.put(c , 0 );
        }
        map.put(c , map.get(c)+1);
       }

       for(int i=0; i<t.length(); i++){
          char c = t.charAt(i);
          if(map.containsKey(c)){
            if(map.get(c)==1){
                map.remove(c);
            }
            else{
                map.put(c , map.get(c)-1);
            }
          }
          else{
           return false;
          }
       }
       return true;
    }
}