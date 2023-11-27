public class printMaximumOfArrUsingRec {
    static int maxValue(int a[], int idx)
    {
        if(idx==a.length-1)
            return a[idx];

        int max=maxValue(a,idx+1);
        if(a[idx]>max)
        {
            max=a[idx];
        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={2,4,8,5,1};
        System.out.println(maxValue(a,0));
    }
}
