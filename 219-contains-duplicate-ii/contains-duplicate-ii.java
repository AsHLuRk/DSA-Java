class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        
        if(k==0 ){
            return false;
        }
        for(int i=0; i<=Math.min(k , nums.length-1); i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }
        }
        int i=0;
        
        for(int j=k+1; j<nums.length; j++){
            
            set.remove(nums[i]);
            if(!set.contains(nums[j])){
                set.add(nums[j]);
            }
            else{
                return true;
            }
            i++;
        }
        return false;
    }
}