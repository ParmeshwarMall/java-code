package Backtracking;
    // MOVE IN ONLY TWO DIRECTION i.e. RIGHT AND DOWN
public class RatInAGridWaysPath {
    static int maze(int sr,int sc,int er,int ec)
    {
        if(sr>er || sc>ec)    // sr---Starting row
            return 0;         // er----Ending row
        if(sr==er && sc==ec)
            return 1;
        int rightWays=maze(sr,sc+1,er,ec);
        int downWays=maze(sr+1,sc,er,ec);
        int totalWays=rightWays+downWays;
        return totalWays;

    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1, 1, rows, cols);
        System.out.println(count);

    }
}
