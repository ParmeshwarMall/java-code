import javax.crypto.spec.PSource;

public class SortingQuestion2 {
    static void sort(int []a,int n)
    {
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            if(a[l]>0 && a[r]<0)
            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
            if(a[l]<0)
                l++;
            if(a[r]>0)
                r--;
        }
    }

    public static void main(String[] args) {
        int[]a={19,-20,7,-4,-13,11,-5,3};
        sort(a,a.length);
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}
