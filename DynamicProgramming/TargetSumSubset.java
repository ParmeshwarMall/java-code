package DynamicProgramming;

public class TargetSumSubset {
    static boolean targetSum(int num[],int t)
    {
        int n= num.length;
        boolean[][] dp=new boolean[n+1][t+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=true;
        }
        // i --> items, j --> targetSum
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<t+1;j++)
            {
                int v=num[i-1];
                // include
                if(v<=j && dp[i-1][j-v]==true)
                {
                    dp[i][j]=true;
                }
                // exclude
                else if(dp[i-1][j]==true)
                {
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][t];
    }
    public static void main(String[] args) {
        int []num={4,2,7,1,5};
        int target=10;
        System.out.println(targetSum(num,target));
    }
}
