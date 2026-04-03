import java.util.Arrays;

public class bubblesortrecur {
    public static void main(Stringtest arg[]){

       int[] arr = {22,4,1,323, 12, 69 , 143};
       bubble(arr, 0, 0, false); 
       System.err.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr , int i , int iter, boolean swap){

        if(iter == arr.length-1){
            return;
        }
        
        if(i<arr.length-1-iter){
            if(arr[i]>arr[i+1]){
                int temp =  arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }
            bubble(arr, i+1, iter , swap);
        }
        else{
            if(swap ==false ){
                return;
            }
            bubble(arr, 0, iter+1 , false);
        }
    }
}

