public class RotatedRecur {
    public static void main(Stringtest arg[]){


       int[] arr = {6 ,7 ,8 ,11, 1 , 3 ,5 };
       System.out.println(search(arr , 3, 0 , arr.length-1));
    }
    public static int search(int[] arr , int target , int low , int high){
      if(low>high){
        return -1;
      }
      int mid = low + (high-low)/2;

      if(arr[mid]==target){
         return mid;
      }

      if(arr[low]<=arr[mid]){
        if(target>=arr[low] && target<=arr[mid]){
        return search(arr, target, low , mid-1);
        }
        else{
            return search(arr, target, mid+1, high);
        }
      }
      else if(target>=arr[mid] && target<=arr[high]){
        return search(arr, target, mid+1, high);
      }
      else{
        return search(arr, target, low, mid-1);
      }
    
    
    }
}
 