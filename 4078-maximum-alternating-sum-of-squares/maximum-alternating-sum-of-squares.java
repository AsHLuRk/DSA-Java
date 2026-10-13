class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long ans = 0;
        int i =0;
        int j =nums.length-1;
        while(i<j){
           ans =ans+nums[j];
            j--;
           ans =ans-nums[i];
            i++;
        }
        if(nums.length%2!=0){
           ans =ans+nums[j];
        }
        return ans;
    }
}