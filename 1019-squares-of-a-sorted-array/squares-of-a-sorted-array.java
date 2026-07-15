class Solution {
    public int[] sortedSquares(int[] nums) {
    int[] ans = new int[nums.length];

    int l =0;
    int r = nums.length-1;

    int index = nums.length-1;

    while(l<=r){
     int ls = nums[l]*nums[l];
     int rs = nums[r]*nums[r];
     
     if(ls>rs){
     ans[index] = ls;
     l++;
     index--;
     }
     else{
      ans[index] = rs;
      r--; 
      index--;
     }
    }
    return ans;
    }
}