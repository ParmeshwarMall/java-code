import java.util.*;
public class ReverseNumberWithSign {
    static long reverse(long x)
    {

        long ans=0;
        int sign = x < 0 ? -1 : 1;
        x= Math.abs(x);
            while (x > 0) {
                long num = x % 10;
                ans = ans * 10 + num;
                x = x / 10;
            }
            return ans*sign;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));

    }
}

/*import java.util.Scanner;

public class Leet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sign = num < 0 ? -1 : 1; // check the sign of the number
        num = Math.abs(num); // remove the sign of the number

        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse of the number is: " + (reverse * sign));
    }
}*/

