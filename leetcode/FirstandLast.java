package leetcode;
public class FirstandLast {
    public static void main(String arg[]){
        int[] arr = {1,1,2,3,4,4,4,4,5,6};
        int low =0;
        int high = arr.length-1;
        int target =4;
        int[] ans = {-1,-1};
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[0]==target){
                ans[0] = 0;
            }
            if(arr[arr.length-1]==target){
                ans[1] = arr.length-1;
            }
            if(target<arr[mid] && target>arr[low]){
                low = mid;
            }
            if(target>arr[low] && arr[mid]==target){
                low++;
            }
            if(target<arr[mid]){
                high = mid-1;
            }
            if(arr[low]==target){
                ans[0]=low;
            }
            if(arr[high]==target){
                ans[1] = high;
            }
        }
    }
}
