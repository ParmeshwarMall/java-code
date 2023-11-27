package Backtracking;

public class RatInADeadMaze2Dirn {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int [][] maze={{1,0,1},
                       {1,1,1},
                       {0,1,1}};
        printPath(0,0,rows-1,cols-1,"",maze);
    }
    private static void printPath(int sr, int sc, int er, int ec,String s,int [][]maze) {
        if(sr>er || sc>ec)
            return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0)
            return;
        printPath(sr,sc+1,er,ec,s+"R",maze);
        printPath(sr+1,sc,er,ec,s+"D",maze);
    }
}
