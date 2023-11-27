public class SumOfSubSetOfArray {
    static void sumSubset(int a[],int n,int idx,int sum)
    {
        if(idx>=n) {
            System.out.println(sum);
            return;
        }
            sumSubset(a,n,idx+1,sum);
            sumSubset(a,n,idx+1,sum+a[idx]);

    }

    public static void main(String[] args) {
        int a[]={2,3};
        int n=2;
        sumSubset(a,n,0,0);
    }
}
