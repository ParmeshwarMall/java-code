public class PlaceNQueensUsingBacktraking {

    public static void printBoard(char board[][]) {
        int n = board.length;
        System.out.println("----------Chess Board------------");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

        public static boolean isSafe(char board[][],int row,int col)
        {
            for(int i=row-1;i>=0;i--)          // Check Upward that queen is safe or not
            {
                if(board[i][col]=='Q')
                {
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
            {
                if(board[i][j]=='Q')         // Check upLeft
                {
                    return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
            {
                if(board[i][j]=='Q')
                {
                    return false;
                }
            }
            return true;
        }

    public static void nQueen(char board[][],int row)
    {
        if(row==board.length)
        {
            printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nQueen(board,row+1);  // Function call
                board[row][j]='X';      // Backtrack
            }
        }
    }
    static int count=0;

    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)         // Initialise
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='X';
            }
        }
        nQueen(board,0);
        System.out.println("No of way to place queen= "+count);
    }
}
