package leetcode;

public class MazeWithObstacle {
    
    public static void main(String[] args) {
    boolean[][] maze = {
        {true,true,true , true},{true ,true , false, true},
        {true,true,true,true},{true, true ,true, true}
    };
    ans(maze, 0, 0, "");
    }
    public static void ans(boolean[][] maze , int m , int n , String s){
        if(m==maze.length-1 && n==maze[0].length-1){
            System.out.println(s);
            return;
        }

        if(maze[m][n]==false){
            return;
        }
        if(m<maze.length-1){
            ans(maze, m+1, n, s+'D');
        }
        if(n<maze[0].length-1){
            ans(maze, m, n+1, s+'R');
        }

    }
}
