class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = 0;
        while(left<right){
            int area = Math.min(height[left], height[right])*Math.abs(right-left);
            max_area = Math.max(max_area, area);
            if(height[right]<height[left]){
                right--;
            }
            else if(height[right]>height[left]){
                left++;
            }
            else{
                left++;
            }  
        }
        return max_area;
    }
}