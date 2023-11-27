package DynamicProgramming;

public class ClimbingStairs {
    static int ways1(int n)        // Using recursion
    {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        return ways1(n-1)+ways1(n-2);
    }

    static int ways2(int n,int dp[])      // Memoization
    {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n]=ways2(n-1,dp)+ways2(n-2,dp);
        return dp[n];
    }

    static int ways3(int n)        // Using tabulation
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        //System.out.println(ways1(n));
        System.out.println(ways2(n,new int[n+1]));
        System.out.println(ways3(n));
    }
}
