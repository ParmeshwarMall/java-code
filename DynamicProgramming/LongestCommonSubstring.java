package DynamicProgramming;

public class LongestCommonSubstring {
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
    public static int LCSubStr(String s1,String s2)
    {
        int ans=0;
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else dp[i][j]=0;
                ans=Math.max(ans,dp[i][j]);
            }
        }
        //print(dp);
        return ans;
    }
    public static void main(String[] args) {
        String s1="ABCDE";
        String s2="GABCE";
        System.out.println(LCSubStr(s1,s2));
    }
}
