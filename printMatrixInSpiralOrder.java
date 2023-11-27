import java.util.*;
public class printMatrixInSpiralOrder
{
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

    static void spiralOrder(int matrix[][], int r, int c)
    {
        int tr=0, br=r-1, lc=0, rc=r-1;

        /* tr=Top row
        br=Bottom row
        lc=Left column
        rc=right column
         */

        int totalElement=0;
        while(totalElement<r*c)
        {
            for(int j=lc;j<=rc && totalElement<r*c;j++)
            {
                System.out.print(matrix[tr][j]+" ");
                totalElement++;
            }
            tr++;
            for(int i=tr;i<=br && totalElement<r*c;i++)
            {
                System.out.print(matrix[i][rc]+" ");
                totalElement++;
            }
            rc--;
            for(int j=rc;j>=lc && totalElement<r*c;j--)
            {
                System.out.print(matrix[br][j]+" ");
                totalElement++;
            }
            br--;
            for(int i=br;i>=tr && totalElement<r*c;i--)
            {
                System.out.print(matrix[i][lc]+" ");
                totalElement++;
            }
            lc++;
        }
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
        System.out.println("Spiral form of matrix is:");
        spiralOrder(matrix,r,c);
    }
}
