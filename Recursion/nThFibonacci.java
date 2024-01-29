package Recursion;

public class nThFibonacci {
    static int fibo(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int n_1=fibo(n-1);
        int n_2=fibo(n-2);
        return n_1+n_2;
    }

    public static void main(String[] args) {
        System.out.println(fibo(30));
    }
}
