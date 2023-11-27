public class QuickSort {
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    static int partition(int a[],int l,int r)
    {
        int pivot=a[l];
        int count=0;
        for(int i=l+1;i<=r;i++)
        {
            if(a[i]<=pivot) {
                count++;
            }
        }

        int pivotIdx=count+l;
        swap(a,l,pivotIdx);

        int i=l;
        int j=r;

        while(i<pivotIdx && j>pivotIdx)
        {
            while(a[i]<=pivot) {
                i++;
            }
            while(a[j]>pivot) {
                j--;
            }

            if(i<pivotIdx && j>pivotIdx)
            {
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void sort(int a[],int l,int r)
    {
        if(l>=r) {
            return;
        }
        int pi=partition(a,l,r);
        sort(a,l,pi-1);
        sort(a,pi+1,r);
    }

    public static void main(String[] args) {
        int a[]={-3,-4,3,2,1};
        sort(a,0,a.length-1);
        for(int val:a)
            System.out.print(val+" ");
    }
}
