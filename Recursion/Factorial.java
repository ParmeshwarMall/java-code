package Recursion;

public class Factorial {
    static int fac(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact=n*fac(n-1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
