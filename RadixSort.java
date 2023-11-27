public class RadixSort {
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

    static void countSort(int a[],int place)
    {
        int n=a.length;
        int output[]=new int[n];
        int count[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            count[(a[i]/place)%10]++;
        }

        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--)
        {
             int idx=count[(a[i]/place)%10]-1;
             output[idx]=a[i];
             count[(a[i]/place)%10]--;
        }

        for(int i=0;i<n;i++)
        {
            a[i]=output[i];
        }

    }

    static void radixSort(int a[])
    {
        int max=findMax(a);
        for(int place=1;max/place>0;place*=10)
        {
            countSort(a,place);
        }
    }

    public static void main(String[] args) {
        int a[]={1000,543,999,234,3546};
        radixSort(a);
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}
