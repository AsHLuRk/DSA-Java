import java.util.Arrays;

public class CyclicSort {
    public static void main(Stringtest arg[]){
         

      int[] arr = {-1, -5, 3, 1};
       int i = 0;
       while(i<arr.length){
        if(arr[i]>0 && arr[i]<=arr.length && i!=arr[i]-1 ){
          
           int temp = arr[i];
           arr[i] = arr[arr[i]-1];
           arr[temp-1] = temp;
        }
        else{
          if(arr[i]<0){
            i++;
            continue;
          }
            i++;
        }

       }
      
      for(int j=1; j<arr.length; j++){
        if(arr[j]>0 && arr[j-1]<0){
          System.out.println(arr[j]-1);
        }
      }

      
    }
}
