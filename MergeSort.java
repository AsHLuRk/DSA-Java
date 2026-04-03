import java.util.Arrays;

public class MergeSort {
    public static void main(Stringtest arg[]){


        int[] arr = {22,4,53,21,3456,33};
         merge(arr, 0, arr.length);
         System.out.println(Arrays.toString(arr));
    }
    static void merge(int[] arr , int s , int e ){

        if(arr.length==1){
            return;
        }
        int mid = arr.length/2;
        merge(arr,s , mid);
        merge(arr,mid, e);

        mergearray(arr, s , e , mid);
    }
    static void mergearray(int[] arr, int s , int e , int mid){

        int i =0;
        int j=mid;
        int k = 0;
        while(i<mid && j<e){
            if(arr[i]>arr[j]){
              arr[k] = arr[j];
              j++;
            }
            else{
               arr[k] = arr[i];
              i++;
            }
            k++;
        }
        while(i<mid){
           arr[k] = arr[i];
            i++;
            k++;
        }
         while(j<e){
            arr[k] = arr[j];
            j++;
            k++;
        }
       
    }
}
