import java.util.*;
public class sumOfNoFrom1ToN {
    static int sum(int n)
    {
        if(n==0)
            return 0;

        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Ans= "+sum(n));
    }
}
