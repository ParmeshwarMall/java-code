package Backtracking;

public class Kknights {
static int number=5;   // Global variable
    static boolean helper(char[][] grid,int row,int col)
    {
        int n=grid.length;
        int i,j;

        // check 2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]=='K') {
            return false;
        }

        // Check 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]=='K') {
            return false;
        }

        // Check 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]=='K') {
            return false;
        }

        // Check 2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]=='K') {
            return false;
        }

        // Check 2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]=='K') {
            return false;
        }

        // Check 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]=='K') {
            return false;
        }

        // Check 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]=='K') {
            return false;
        }

        // Check 2 left 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]=='K') {
            return false;
        }

        return true;
    }
    static void knights(char[][] board,int row,int col,int num)
    {
        int n=board.length;
        if(row==n)
        {
            if(num==number)
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return;
        }
       else if(helper(board,row,col))
        {
            board[row][col]='K';
            if(col!=n-1)
                knights(board,row,col+1,num+1);
            else knights(board,row+1,0,num+1);
            board[row][col]='.';
        }
        if(col!=n-1)
            knights(board,row,col+1,num);
        else knights(board,row+1,0,num);
    }
    public static void main(String[] args) {
        int n=3;
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }

        knights(board,0,0,0);
    }
}
