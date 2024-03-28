package DynamicProgramming;

public class LongestCommonSubsequence {
    static int LCS(String s1,String s2,StringBuilder sb)
    {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    sb.append(s1.charAt(i-1));
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
        StringBuilder sb=new StringBuilder("");
        System.out.println(LCS("abcde","ace",sb));
        System.out.println("LCS= "+sb);
    }
}
