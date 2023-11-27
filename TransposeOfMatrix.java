import java.util.*;
public class TransposeOfMatrix {
    static void printMatrix(int m[][])
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int [][]transposeMatrix(int matrix[][], int r, int c)
    {
        int ans[][]=new int [c][r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }

    // Swap without another 2D array

     static void transposeInMatrix(int matrix[][], int r, int c)
     {
         for(int i=0;i<r;i++)
         {
             for(int j=i;j<c;j++)
             {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
             }
         }
         printMatrix(matrix);
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of row");
        int r=sc.nextInt();
        System.out.println("Enter no. of column");
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter "+r*c+" value");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix is:");
        //int ans[][]=transposeMatrix(a,r,c);
        //printMatrix(ans);

        transposeInMatrix(matrix,r,c);
    }
}
