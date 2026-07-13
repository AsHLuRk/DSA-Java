class Solution {
    public void nextPermutation(int[] nums) {
  
   int index =-1;
    for(int i =nums.length-2; i>=0; i--){
        if(nums[i]<nums[i+1]){
            index=i;
            break;
        }
    }
    
    if(index!=-1){
    for(int i =nums.length-1; i>=0; i--){
        if(nums[i]>nums[index]){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            break;
        }
    }
    }
    index = (index==-1)?0:index+1;
    int left = nums.length-1;
    while(index<left){
        int temp = nums[index];
        nums[index] = nums[left];
        nums[left] = temp;
        index++;
        left--;
    }
   
    }
}