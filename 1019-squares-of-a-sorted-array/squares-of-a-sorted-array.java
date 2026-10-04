class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left =0;
        int right = nums.length -1;
        int point = right;

        while(left<=right){
        
        if(nums[left]*nums[left]>nums[right]*nums[right]){
            ans[point] = nums[left]*nums[left];
            left++;
            point--;
        }
        else{
            ans[point] = nums[right]*nums[right];
            right--;
            point--;
        }
        }
        return ans;
    }
}