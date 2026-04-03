package leetcode;
import java.util.Scanner;

public class commonsubse {

    public static int max(int i, int j, int[][] arr){ 
        if(arr[i-1][j]>arr[i][j-1]){
             return arr[i-1][j];
        }
        else{
            return arr[i][j-1];
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = scn.nextLine();
        System.out.println("Enter the second String");
        String str2 = scn.nextLine();
        int[][] arr;
        int n = str1.length();
        int y = str2.length();
       if(n>y){
        arr = new int[y+1][n+1];
       for(int i=0; i<y;i++){
        for(int j=0; j<n; j++){
            if(str2.charAt(i)==str1.charAt(j)){
              arr[i+1][j+1]=arr[i][j]+1;
            }
            if(str2.charAt(i)!=str1.charAt(j)){
                arr[i+1][j+1]=max(i+1, j+1, arr);
            }
        }
       }
       System.out.println("longest common subsequent "+arr[y][n]);
    }
    else if(y>n){
        arr = new int[n+1][y+1];
           for(int i=0; i<n;i++){
        for(int j=0; j<y; j++){
            if(str1.charAt(i)==str2.charAt(j)){
              arr[i+1][j+1]=arr[i][j]+1;
            }
            if(str1.charAt(i)!=str2.charAt(j)){
                arr[i+1][j+1]=max(i+1,j+1, arr);
            }
        }
       }
       System.out.println("longest common subsequent "+arr[n][y]);
    }
    else{
      arr = new int[y+1][n+1];
       for(int i=0; i<y;i++){
        for(int j=0; j<n; j++){
            if(str2.charAt(i)==str1.charAt(j)){
              arr[i+1][j+1]=arr[i][j]+1;
            }
            if(str2.charAt(i)!=str1.charAt(j)){
                arr[i+1][j+1]=max(i+1, j+1, arr);
            }
        }
       }
         System.out.println("longest common subsequent "+arr[y][n]);
    }
  
    }
}