package DynamicProgramming;

public class UnboundedKnapsack {
    static int knapsack(int val[],int wt[],int w,int dp[][])
    {
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                int v=val[i-1];
                int W=wt[i-1];
                if(W<=j)
                {
                    int inc=v+dp[i][j-W];
                    int exc=dp[i-1][j];
                    dp[i][j]=Math.max(inc,exc);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[val.length][w];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int dp[][]=new int[val.length+1][w+1];
        int ans=knapsack(val,wt,w,dp);
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Ans= "+ans);
    }
}
