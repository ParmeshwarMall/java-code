import java.util.*;
public class generateSpiralMatrix {
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

    static int[][] spiralMatrix(int n)
    {
        int matrix[][]=new int[n][n];
        int tr=0, br=n-1, lc=0, rc=n-1;

        /* tr=Top row
        br=Bottom row
        lc=Left column
        rc=right column
         */

        int current=1;
        while(current<=n*n)
        {
            for(int j=lc;j<=rc && current<=n*n;j++)
            {
                matrix[tr][j]=current;
                current++;
            }
            tr++;
            for(int i=tr;i<=br && current<=n*n;i++)
            {
                matrix[i][rc]=current++;
            }
            rc--;
            for(int j=rc;j>=lc && current<=n*n;j--)
            {
                matrix[br][j]=current++;
            }
            br--;
            for(int i=br;i>=tr && current<=n*n;i--)
            {
                matrix[i][lc]=current++;
            }
            lc++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Your spiral matrix is:");
        int ans[][]=spiralMatrix(n);
        printMatrix(ans);
    }
}
