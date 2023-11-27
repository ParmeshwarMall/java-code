public class SumOfArrayUsingRecursion {
    static int arraySum(int a[], int idx)
    {
        if(idx==a.length-1)
            return a[idx];

        int sum=arraySum(a,idx+1);
        return sum+a[idx];
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(arraySum(a,0));
    }
}
