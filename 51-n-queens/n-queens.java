class Solution {
    List<List<String>> ans1 = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
       boolean[][] maze = new boolean[n][n];
       ans(maze , 0);
      return ans1;

    }
    public void ans(boolean[][] maze , int row){

        if(row == maze.length){
            List<String> current = new ArrayList<>();
        for(int i=0; i<maze.length; i++){
         StringBuilder sb = new StringBuilder();
         for(int j =0 ; j<maze[0].length; j++){
            
            if(maze[i][j]==true){
             sb.append("Q");
            }
            else{
            sb.append(".");
            }
         
         }
         current.add(sb.toString());
         
      }
           ans1.add(new ArrayList<>(current));
            return;
        }
        for(int col= 0; col<maze.length; col++){

            if(isSafe(maze , row , col)){
                maze[row][col] = true;
                ans(maze , row+1);
                maze[row][col] = false;
            }
        }
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