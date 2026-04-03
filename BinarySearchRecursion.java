public class BinarySearchRecursion {
    public static void main(Stringtest[] args) {
        
    
    int[] arr = {1,33,44,123,340,333,412,444,445};
    
    System.err.println("Is value present: "+binarysearch(arr, 340 , 0 , arr.length-1));
    }
    public static int binarysearch(int[] arr, int value , int low , int high){
        
       if(low>high){
        return -1;
       }
        int mid = low +(high-low)/2;
        if(arr[mid]==value){
          return mid;
        }
        if(arr[mid]>value){
            binarysearch(arr, value, low, mid-1);
        }
        if(arr[mid]<value){
            binarysearch(arr, value, mid+1, high);
        }
       return -1;
      
    }
}
