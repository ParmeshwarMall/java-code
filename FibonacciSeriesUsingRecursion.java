import java.util.*;
public class FibonacciSeriesUsingRecursion
    {
        static int fibon(int n)
        {
           if(n==1)
               return 0;
           if(n==2)
               return 1;

           int f1=fibon(n-1);
           int f2=fibon(n-2);
           int f=f1+f2;
           return f;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of term");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
                System.out.print(fibon(i) + " ");
            }
        }
    }

