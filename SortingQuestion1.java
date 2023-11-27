public class SortingQuestion1 {
    static void sort(int []a,int n)
    {
        int x=-1;
        int y=-1;
        if(n<=1)
            return;

        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                if(x==-1)
                {
                    x=i-1;
                    y=i;
                }
                else {
                    y = i;
                }
            }
        }
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    public static void main(String[] args) {
        int []a={3,1};
        sort(a,a.length);
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}
