import java.util.Arrays;

public class selectionSortRecurr {

    public static void main(Stringtest arg[]){

        int[] arr = {11,4,3,223,5532,12,90,0};
    //    selection(arr, 0, 0, 0);
    //    System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
    }
    public static void selection(int[] arr , int i , int iter , int max){

       if(iter==arr.length-1){
        return;
       }

       if(i<arr.length-iter-1){
         
        if(arr[i]>arr[max]){
            max = i;
        }
        selection(arr, i+1, iter, max);
       }
       else{
             int temp = arr[i];
             arr[i] = arr[max];
             arr[max] = temp;
             selection(arr,  0,iter+1, 0);    
    
       }
    }
}
