import java.lang.reflect.Array;
import java.util.Arrays;

public class selectrionSort {
    public static void main(Stringtest arg[]){
        int[] arr = {12,2,3,55,1,0};
        for(int i =0; i<arr.length; i++){
            int maxIn=0;
            int last = arr.length -i -1;
            int maxnum = Integer.MIN_VALUE;
            for(int j =0; j<arr.length - i; j++){
                if(arr[j]>arr[maxIn]){
                     maxIn = j;
                     
                }
            }
            int temp = arr[last];
                arr[last] = arr[maxIn];
                arr[maxIn] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
