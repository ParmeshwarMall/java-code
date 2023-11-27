import java.util.*;
public class SumOfSeries {    // If n=5 then output will be ---> 1-2+3-4+5
    static int seriesSum(int n)
    {
        if(n==0)
            return 0;

        if(n%2==0)
        {
            return seriesSum(n-1)-n;
        }
        else
        {
            return seriesSum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Ans= "+seriesSum(n));
    }
}
