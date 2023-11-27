import java.util.*;
public class forLoop {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
           // System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Sum= "+sum);
    }
}
