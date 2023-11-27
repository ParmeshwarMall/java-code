public class CountSort {
    static int findMax(int a[])
    {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mx)
                mx=a[i];
        }
        return mx;
    }

    static void sort(int a[])
    {
        int max=findMax(a);
        int count[]=new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }

        int k=0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                a[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,2,3};
        sort(a);
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}
