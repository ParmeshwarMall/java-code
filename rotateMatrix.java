import java.util.*;
public class rotateMatrix
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
    }

    static void reverseArray(int a[])
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int matrix[][],int r, int c)
    {
          transposeInMatrix(matrix,r,c);

          // Now reverse each row
        // r=c
         for(int i=0;i<r;i++)
         {
                reverseArray(matrix[i]);
         }

         //printMatrix(matrix);
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
        System.out.println("Rotate matrix is: ");
        rotateMatrix(matrix,r,c);
        printMatrix(matrix);
    }
}
