class Solution {
    public void sortColors(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int leftint = nums[left];
            int rightint = nums[right];
            if (leftint == 0) {
                left++;
            }
            else if (leftint != 0 && rightint == 0) {
                int temp = leftint;
                nums[left] = 0;
                nums[right] = temp;
                left++;
                right--;
            }
            else {
                right--;
            }
        }
        right = nums.length - 1;
        while (left <= right) {
            int leftint = nums[left];
            int rightint = nums[right];
            if (leftint == 1) {
                left++;
            }
            else if (leftint != 1 && rightint == 1) {
                int temp = leftint;
                nums[left] = 1;
                nums[right] = temp;
                left++;
                right--;
            }
            else {
                right--;
            }
        }
    }
}