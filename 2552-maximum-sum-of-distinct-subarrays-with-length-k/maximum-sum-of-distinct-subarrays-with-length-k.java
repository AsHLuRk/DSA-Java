class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        long result = 0;
        long sum = 0;
        int dup = 0;
        

        for(int i=0; i<k; i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i], map.get(nums[i])+1);
            if(map.get(nums[i])>1){
                dup++;
            }
            sum +=nums[i];
        }
        if(dup==0){
            result = sum;
        }
        for(int j=k; j<nums.length; j++){

            if(!map.containsKey(nums[j])){
                map.put(nums[j], 0);
            }
            map.put(nums[j], map.get(nums[j])+1);

            if(map.get(nums[j])>1){
                dup++;
            }
            if(map.get(nums[j-k])>1){
                dup--;
            }
            if(map.get(nums[j-k])==1){
            map.remove(nums[j-k]);
            }
            else{
                map.put(nums[j-k], map.get(nums[j-k])-1);
            }
            sum = sum +nums[j] - nums[j-k];
            if(dup==0){
                if(sum>result){
                    result = sum;
                }
            }

        }
        return result;
            }
            
        }
   