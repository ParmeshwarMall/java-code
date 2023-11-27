public class SearchFirstOccurenceofTarget {
    static int search(int a[],int n,int target)
    {
        int st=0,end=n-1,idx=-1;
        while(st<=end)
        {
            int mid=(st+end)/2;

            if(target==a[mid]){
                end=mid-1;
                idx=mid;
            }
            else if(target<a[mid])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int a[]={2,5,5,5,6,6,8,9,9,9};
        int n=a.length;
        int x=search(a,n,5);
        if(x>=0)
            System.out.println("Element found at index: "+x);
        else
            System.out.println("Element not found");
    }
}
