package DynamicProgramming;

public class EditDistance {

    public static void print(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int ED(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=i;
        }
        for(int j=0;j<m+1;j++)
        {
            dp[0][j]=j;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(del,rep));
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="sbd";
        System.out.println(ED(s1,s2));
    }
}
