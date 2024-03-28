package DynamicProgramming;

public class CatalanNumber {
    static int catalanRec(int n)
    {
        if(n==0 || n==1)
            return 1;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=catalanRec(i)*catalanRec(n-i-1);
        }
        return ans;
    }

    static int catalanMemo(int n,int []dp)
    {
        if(n==0 || n==1)
            return 1;

        if(dp[n]!=0)
            return dp[n];

        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=catalanMemo(i,dp)*catalanMemo(n-i-1,dp);
            dp[n]=ans;
        }
        return dp[n];
    }

    static int catalanTab(int n,int[]dp)
    {
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        //System.out.println(catalanRec(n));

        int dp1[]=new int[n+1];
         //System.out.println(catalanMemo(n,dp1));

         int dp2[]=new int[n+1];
         dp2[0]=1;
         dp2[1]=1;
        System.out.println(catalanTab(n,dp2));
    }
}
