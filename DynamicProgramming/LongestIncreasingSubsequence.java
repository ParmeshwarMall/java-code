package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequence {
    static int LCS(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(a[i-1]==b[j-1])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    int x=dp[i][j-1];
                    int y=dp[i-1][j];
                    dp[i][j]=Math.max(x,y);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int a[]={50,3,10,7,40,80};
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }

        int newA[]=new int[h.size()];
        int k=0;
        for(int i:h)
        {
            newA[k++]=i;
        }

        Arrays.sort(newA);
        System.out.println(LCS(a,newA));
    }
}
