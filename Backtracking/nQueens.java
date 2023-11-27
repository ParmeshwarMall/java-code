package Backtracking;

public class nQueens {
    static int c=0;
    static void nQueen(char[][] board,int row)
    {
        int n=board.length;
        if(row==n)
        {
            c++;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check row that it is Safe or not
        int n=board.length;
        for(int j=0;j<n;j++)
        {
            if(board[row][j]=='Q')
                return false;
        }

        //Check columns
        for(int i=0;i<n;i++)
        {
            if(board[i][col]=='Q')
                return false;
        }

        // Check eastNorth
        int i=row;
        int j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
                return false;
            i--;
            j++;
        }

        // Check westNorth
        i=row;
        j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
                return false;
            i--;
            j--;
        }

        //Check WestSouth
        i=row;
        j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
                return false;
            i++;
            j--;
        }

        // Check southEast
        i=row;
        j=col;
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')
                return false;
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='X';
            }
        }
        nQueen(board,0);
        System.out.println(c);
    }
}
