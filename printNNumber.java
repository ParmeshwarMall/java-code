import java.util.*;
public class printNNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the no. of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n)
        {
            //System.out.println(i);
            sum=sum+i;
            i++;
        }

        System.out.println("Sum= "+sum);

    }
}
