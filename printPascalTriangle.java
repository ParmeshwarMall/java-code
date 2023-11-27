import java.util.*;
public class printPascalTriangle {

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

    static int [][] pascalTriangle(int n)
    {
        int ans[][]=new int[n][];

        for(int i=0;i<n;i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n=sc.nextInt();

        int ans[][]=pascalTriangle(n);
        printMatrix(ans);
    }
}
