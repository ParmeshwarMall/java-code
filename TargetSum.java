import java.util.*;
public class TargetSum {
    static void target(int a[],int t,int n)
    {
        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==t)
                    ans++;
            }
        }
        System.out.println(ans);
        //return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" element of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter your target");
       int t=sc.nextInt();

        //System.out.println(target(a,t,n));
       target(a,t,n);
    }
}
