class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int item = nums[i];
        if(!map.containsKey(item)){
            map.put(item , 0);
        }
        map.put(item , map.get(item)+1);
        if(map.get(item)>nums.length/2){
            return item;
        }
       } 
        return -1;
    }
}