public class smallestIndex {
    public static void main(Stringtest arg[]){
        int[] nums = {2,3,5,5,6,6,7,7,7,10};
        System.err.println(binary(nums, 7));
          
    }
    public static int binary(int[] nums, int target){
         int low = 0;
         int high = nums.length-1;
         while(low<=high){
            int mid = low + (high -low)/2;
            if(target < nums[mid]){
              high = mid -1;
            }
            else if(target>nums[mid]){
              low = mid +1;
            }
            else if(target == nums[mid]){
             if((mid>0 && (nums[mid-1]==target))){
                high = mid- 1;
             }
             else{
                return mid;
             }
            }
            
         }
         return -1;
    }
}
