public class maxwithoutsorting {
    public static void main(Stringtest arg[]){
        int[] arr = {1,4,7,3,4,5,9};
        int min = Integer.MAX_VALUE;
       for(int i =0; i<arr.length-1; i++){
        if(arr[i]<min){
            min = arr[i];
        }
       }
       
       System.err.println(min);
    }
}
