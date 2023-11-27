import java.util.*;
public class PrefixSum {
    static int [] prefixSumArray(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+a[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int [] arr=prefixSumArray(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of queries");
        int q=sc.nextInt();
        while(q-->0) {
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = arr[r]-arr[l - 1];
            System.out.println("Ans= " + ans);

        }
    }
}
