public class FindSquareRoot {
    static int sqrt(int x)
    {
        int l=0,r=x;
        int ans=-1;

        while(l<=r)
        {
            int mid=(l+r)/2;
            int val=mid*mid;
            if(val==x)
            {
                return mid;
            }
            else if(val<x)
            {
                l=mid+1;
                ans=mid;
            }
            else
            {
                r=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x=13;
        System.out.printf("Absolute Square root of %d is %d",x,sqrt(x));
    }
}
