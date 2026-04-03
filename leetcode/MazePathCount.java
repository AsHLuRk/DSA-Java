package leetcode;

public class MazePathCount {
    public static void main(String[] args) {
        int m = 3;
        int n=7;
        System.out.println(ans(m, n));
    }
    public static int ans(int m, int n){

        if(m==1||n==1){
            return 1;
        }
        int count =0;
        count+=ans(m-1, n);
        count+=ans(m,n-1);

        return count;
      
    }
    
}
