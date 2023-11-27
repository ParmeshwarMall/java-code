import java.util.*;
public class FactorialUsingRecursion {
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int f=factorial(n-1);
        return n*f;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial= "+fact);

    }
}
