import java.util.*;
public class seriesSum {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last Digit");
        int n=sc.nextInt();
        int ans=0, i;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                ans -= i;

                else
                ans += i;
        }
        System.out.println("Sum of series ="+ans);
    }
}
