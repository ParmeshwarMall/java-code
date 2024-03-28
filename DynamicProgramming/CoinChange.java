package DynamicProgramming;

public class CoinChange {
    static int coinChg(int coin[],int sum)
    {
        int n=coin.length;
        int [][]dp=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                int c=coin[i-1];
                if(c<=j)
                {
                    dp[i][j]=dp[i][j-c]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int []coin={1,2,3};
        int sum=4;
        System.out.println(coinChg(coin,sum));
    }
}
