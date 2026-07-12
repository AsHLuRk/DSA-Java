class Solution {
    public int majorityElement(int[] nums) {

        int item= 0;
        int count =0;
        
        for(int num:nums){
            if(count==0){
                item = num;
            }

            count += (num==item)?1:-1;
        }
        return item;
    }
}