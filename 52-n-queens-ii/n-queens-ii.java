class Solution {
    public int totalNQueens(int n) {
        boolean[][] grid = new boolean[n][n];
        return ans(grid , 0);
    }
     public int ans(boolean[][] maze , int row){

        if(row == maze.length){
            
            return 1;
    
        }
        int count =0;
        for(int col= 0; col<maze.length; col++){

            if(isSafe(maze , row , col)){
                maze[row][col] = true;
               count+= ans(maze , row+1);
                maze[row][col] = false;
            }
        }
         return count;

    }
    public boolean isSafe(boolean[][] maze , int row , int col){

        //col
        int startrow = row-1;
           while(startrow>=0){
            if(maze[startrow][col] == true){
                return false;
            }
            startrow--;
           }
        startrow = row-1;
        int startcol = col-1;
        //diagonal1
         while(startcol>=0 && startrow>=0){
             if(maze[startrow][startcol] == true){
                return false;
            }
            startrow--;
            startcol--;
         }
         startrow = row-1;
         startcol = col+1;
        //diagonal2;
        while(startcol<maze[0].length && startrow>=0){
             if(maze[startrow][startcol] == true){
                return false;
            }
            startcol++;
            startrow--;
        }

        return true;

    }
}