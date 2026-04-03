import java.util.Arrays;

public class QuickSort {
    public static void main(Stringtest arg[]){
    
        int[] arr = {22,4,53,1,2,33,0};
        mergeSorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


        
    }
    public static void mergeSorting(int[] arr , int low , int high){

      if(low>=high){

        return;
      }
      int e = high;
      int s = low;
      int mid = s +(e-s)/2;
      
      int pivot = arr[mid];

      while(s<=e){

        while(arr[s]<pivot){
            s++;
        }
        while(arr[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            e--;
            s++;
        }
      }
      mergeSorting(arr, low, e);
      mergeSorting(arr, s, high);
    }
}
