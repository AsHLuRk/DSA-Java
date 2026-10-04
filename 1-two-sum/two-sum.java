class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){

            if(!map.containsKey(nums[i])){
               map.put(nums[i], i);
            }
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                int index = map.get(target-nums[i]);
                ans[0] = (index>i)?i:index;
                ans[1] = (index<i)?i:index;
                return ans;
            }
        }
        return ans;
    }
}