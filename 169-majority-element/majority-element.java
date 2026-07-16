class Solution {
    public int majorityElement(int[] nums) {
     int item=0;
     int count=0;
     for(int i=0; i<nums.length; i++){
      if(count==0){
        item = nums[i];

      }
      count+=(nums[i]==item)?1:-1;
     }
     return item;
    }
}