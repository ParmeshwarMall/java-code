package DynamicProgramming;

public class nThFibonacci {
    static int nthFib(int n,int f[])       // Using memoization
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(f[n]!=0)
        {
            return f[n];
        }
        f[n]=nthFib(n-1,f)+nthFib(n-2,f);
        return f[n];
    }

    static int fabTab(int n)        // Using tabulation
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(nthFib(n,new int[n+1]));
        System.out.println(fabTab(n));
    }
}
