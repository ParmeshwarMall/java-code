public class InsertionSort {
    static void sort(int a[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int n=5;
        sort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
