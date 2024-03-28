package DynamicProgramming;

public class RodCutting {
    static int rodCut(int []length,int []price,int rodLen)
    {
        int n=price.length;
        int [][]dp=new int[n+1][rodLen+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<rodLen+1;j++)
            {
                int l=length[i-1];
                int p=price[i-1];
                if(l<=j)
                {
                    dp[i][j]=Math.max(p+dp[i][j-l],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<n+1;i++) {
            for (int j = 0; j < rodLen + 1; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][rodLen];
    }
    public static void main(String[] args) {
        int []length={1,2,3,4,5,6,7,8};
        int []price={1,5,8,9,10,17,17,20};
        int rodLen=8;
        System.out.println(rodCut(length,price,rodLen));
    }
}
