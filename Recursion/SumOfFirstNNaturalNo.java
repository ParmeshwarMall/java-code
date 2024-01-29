package Recursion;

public class SumOfFirstNNaturalNo {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int n_1=sum(n-1);
        return n+n_1;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
