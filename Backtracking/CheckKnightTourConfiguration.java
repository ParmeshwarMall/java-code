package Backtracking;    // Knight means ghoda

public class CheckKnightTourConfiguration {
    static boolean helper(int[][] grid,int row,int col,int num)
    {
        int n=grid.length;
        if(grid[row][col]==n*n-1)
            return true;
        int i,j;

        // check 2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        // Check 2 left 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) {
            return helper(grid, i, j, num + 1);
        }

        return false;
    }
    static boolean knight(int[][] grid)
    {
        if(grid[0][0]!=0)
            return false;
        return helper(grid,0,0,0);
    }

    public static void main(String[] args) {
        int [][]grid={{0,3,6},
                {5,8,1},
                {2,7,4}};
        System.out.println(knight(grid));
    }
}
