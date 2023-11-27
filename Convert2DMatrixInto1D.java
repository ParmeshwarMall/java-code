public class Convert2DMatrixInto1D {
    static int []array(int a[][],int n,int m)
    {
        int arr[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k++]=a[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int []b=array(a,3,3);
        for(int val:b)
        {
            System.out.print(val+" ");
        }
    }
}
