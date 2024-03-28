package DynamicProgramming;

public class Knapsack01 {
    static int knapsack1(int []val,int []wt,int W,int n)   // Using recursion  TC = O(2^n)
    {
        if(W==0 || n==0)
        {
            return 0;
        }
        //valid
        if(wt[n-1]<=W)    // Check from last
        {
            //include
            int ans1=val[n-1]+knapsack1(val,wt,W-wt[n-1],n-1);
            //exclude
            int ans2=knapsack1(val,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else return knapsack1(val,wt,W,n-1);     // Not valid
    }

    static int knapsack2(int []val,int []wt,int W,int n,int dp[][])   // Using Memoization     TC = O(n*W)
    {
        if(W==0 || n==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        //valid
        if(wt[n-1]<=W)    // Check from last
        {
            //include
            int ans1=val[n-1]+knapsack2(val,wt,W-wt[n-1],n-1,dp);
            //exclude
            int ans2=knapsack2(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }
        else           // Not valid
        {
            dp[n][W]=knapsack2(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }

    static int knapsack3(int val[],int wt[],int W)
    {
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                int v=val[i-1];
                int w=wt[i-1];
                //if valid
                if(w<=j)
                {
                    int incProfit=v+dp[i-1][j-w];
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,excProfit);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
       return dp[n][W];
    }

    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int [][]dp=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        //System.out.println(knapsack1(val,wt,W, val.length));
        //System.out.println(knapsack2(val,wt,W, val.length,dp));
        System.out.println(knapsack3(val,wt,W));
    }
}
