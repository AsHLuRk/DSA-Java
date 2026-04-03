package leetcode;
public class spiral {
    public static void main(String arg[]){
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},
    {11,12,13,14,15},
    {16,17,18,19,20},
    {21,22,23,24,25}
    };
     int top = 0;
     int bottom = arr.length-1;
     int left = 0;
     int right = arr[top].length-1;
     while(top<=bottom &&left<=right){

        for(int i = left; i<=right; i++){
          System.out.println(arr[top][i]);
        }
        top++;
        for(int i=top; i<=bottom; i++){
        System.out.println(arr[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i = right; i>=left; i--){
            System.out.println(arr[bottom][i]);
        }
        bottom--;}
        if(left<=right){
        for(int i =bottom; i>=top;i--){
            System.out.println(arr[i][left]);
        }
        left++;
    }
     }
       
    }
}
