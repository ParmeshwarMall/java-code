package Hashmap;

public class TargetSum1 {
    static int []target(int []a,int t)
    {
        int n=a.length;
        int [] ans={-1};
//        int [] ans1=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==t)
                {
                   ans=new int[]{i,j};
                   return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={14,7,10,4,5,9,1,2};
        int [] ans=target(a,20);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
