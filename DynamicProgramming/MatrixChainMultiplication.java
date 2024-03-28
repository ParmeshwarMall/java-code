package DynamicProgramming;

import com.sun.security.jgss.GSSUtil;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class MatrixChainMultiplication {
    static int MCMRec(int []a,int i,int j)
    {
        if(i==j)
            return 0;

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int c1=MCMRec(a,i,k);
            int c2=MCMRec(a,k+1,j);
            int c3=a[i-1]*a[k]*a[j];
            int fcost=c1+c2+c3;
            ans=Math.min(ans,fcost);
        }
        return ans;
    }

    static int MCMMemo(int a[],int i,int j,int [][]dp)  // O(n^2)
    {
        if(i==j)
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int c1=MCMMemo(a,i,k,dp);
            int c2=MCMMemo(a,k+1,j,dp);
            int c3=a[i-1]*a[k]*a[j];
            int fans=c1+c2+c3;
            ans=Math.min(ans,fans);
            dp[i][j]=ans;
        }
        return dp[i][j];
    }

    static int MCMTab(int a[])
    {
        int n=a.length;
        int [][]dp=new int[n][n];

        for(int len=2;len<=n-1;len++)
        {
            for(int i=1;i<=n-len;i++)
            {
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++)
                {
                    int c1=dp[i][k];
                    int c2=dp[k+1][j];
                    int c3=a[i-1]*a[k]*a[j];
                    int fcost=c1+c2+c3;
                    dp[i][j]=Math.min(dp[i][j],fcost);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int a[]={3,2,4,2,5};
//        int []a={1,2,3,4,3};
        int n=a.length;
        System.out.println(MCMRec(a,1,n-1));

//        int dp[][]=new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            Arrays.fill(dp[i],-1);
//        }
//        System.out.println(MCMMemo(a,1,n-1,dp));

        System.out.println(MCMTab(a));
    }
}
