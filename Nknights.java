public class Nknights {
    
    public static void main(String[] args) {

        int n =4;
        boolean[][] maze = new boolean[n][n];
       System.out.println(ans(maze, 0));
    }
    public static int ans(boolean[][] maze , int col){
     
        if(col==maze[0].length){
        display(maze);
        return 1;
        }
       int count =0;
        for(int row =0; row<maze.length; row++){
           
            if(isSafe(maze, row , col)){
                maze[row][col]=true;
                count+=ans(maze, col+1);
                maze[row][col] = false;
            }
        }
        return count;
    }
   public static boolean isSafe(boolean[][] maze, int row, int col){

    // 2 up, 1 left
    if(row >= 2 && col >= 1){
        if(maze[row-2][col-1]) return false;
    }

    // 2 down, 1 left
    if(row <= maze.length-3 && col >= 1){
        if(maze[row+2][col-1]) return false;
    }

    // 1 up, 2 left
    if(row >= 1 && col >= 2){
        if(maze[row-1][col-2]) return false;
    }

    // 1 down, 2 left
    if(row <= maze.length-2 && col >= 2){
        if(maze[row+1][col-2]) return false;
    }

    return true; // ← was missing
}
    public static void display(boolean[][] maze){

        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                if(maze[i][j]==true){
                    System.out.print("K ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
}