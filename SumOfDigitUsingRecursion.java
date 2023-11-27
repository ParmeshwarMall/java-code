import java.util.*;
public class SumOfDigitUsingRecursion {
    static int sod(int n)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        int s=sod(n/10);
        return (n%10)+s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
