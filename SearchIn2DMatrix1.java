import java.util.*;
public class SearchIn2DMatrix1 {
    static boolean search(int a[][],int target)
    {
        int m=a.length,n=a[0].length;
        int st=0,end=m*n-1;

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int midElt=a[(mid/n)][(mid%n)];
            if(target==midElt)
            {
                return true;
            }
            else if(target<midElt)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
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
