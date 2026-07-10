class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<11){
            return new ArrayList<>();
        }
        Set<Integer> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        int sum = 0;
        for(int i=0; i<=9; i++){
            
          sum = sum + (int)Math.pow(4 , 9-i)*map.get(s.charAt(i));
        }
        set.add(sum);
        for(int i=1; i<=s.length()-10; i++){  
        sum = (int)(sum - Math.pow(4,9)*map.get(s.charAt(i-1)))*4 + map.get(s.charAt(i+9));
        if(set.contains(sum)){
            String subs = s.substring(i , i+10);
            ans.add(subs);
            
        }
        else{
            set.add(sum);
        }
        }
        return new ArrayList<>(ans);
    }
}