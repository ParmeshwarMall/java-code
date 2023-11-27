import java.util.Scanner;

public class SearchIn2DMatrix2 {
    static boolean search(int a[][],int target)   // Matrix are sorted in row wise and column wise
    {
        int m=a.length,n=a[0].length;
        int i=0,j=n-1;

        while(i<m && j>=0)
        {
            if(target==a[i][j])
            {
                return true;
            }
            else if(target<a[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]a=new int [m][n];
        System.out.println("Enter 2D matrix");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter target");
        int target=sc.nextInt();
        System.out.println(search(a,target));
    }
}
