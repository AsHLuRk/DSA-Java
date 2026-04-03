public class Rotatedarray {
    public static void main(Stringtest[] args){
       int[] nums = {4,5,6,7,0,1,2};
       System.err.println(search(nums, 5));
        
    }
    static int search(int[] nums, int target){
        int low =0;
        int high = nums.length-1;
        while(low<=high){

            int mid = low +(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[low]<=nums[mid]){
               if(target<nums[mid] && target>=nums[low]){
                   high = mid-1;
               }
               else{
                low = mid+1;
               }


            }
            else{

            if(target>nums[mid] && target<=nums[high]){
                low = mid+1;
            }
            else{
                high= mid-1;
            }
            }
        }
        return -1;
    }
}
