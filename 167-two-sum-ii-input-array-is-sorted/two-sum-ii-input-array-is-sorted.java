class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low =0;
        int high = numbers.length-1;
        int[] ans = new int[2];
        while(low<high){
            if(numbers[low]+numbers[high]<target){
                low++;
            }
            else if(numbers[low]+numbers[high]>target){
                high--;
            }
            else{
                ans[0] = low+1;
                ans[1] = high+1;  
                return ans;
            }
        }
        return ans;
    }
}