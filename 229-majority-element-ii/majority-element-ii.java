class Solution {
    public List<Integer> majorityElement(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();

     Set<Integer> set = new HashSet<>();

     for(int num: nums){
        if(!map.containsKey(num)){
            map.put(num ,0 );
        }
        map.put(num , map.get(num)+1);
        if(map.get(num)>nums.length/3){
         set.add(num);
        }
     }
     return new ArrayList<>(set);
    }
}