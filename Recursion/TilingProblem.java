package Recursion;

public class TilingProblem {
    static int tiling(int n)   // 2xn is the floor size
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int tn_1=tiling(n-1);   // Vertical choice
        int tn_2=tiling(n-2);   // Horizontal choice
        return tn_1+tn_2;
    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
