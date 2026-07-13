class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int item = nums[i];
            if(!map.containsKey(item)){
                map.put(item , 0);
            }
            map.put(item , map.get(item)+1);
            if(map.get(item)>1){
                set.add(item);
            }
        }
        return new ArrayList<>(set);
    }
}