import java.util.*;
public class Print1ToNUsingRecursion {
    static void printIncreasingNumber(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        printIncreasingNumber(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
       // printIncreasingNumber(n);
        printDecreasing(n);
    }
}
