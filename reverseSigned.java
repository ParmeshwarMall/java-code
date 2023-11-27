import java.util.*;
public class reverseSigned{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a signed number: ");
            int num = scanner.nextInt();

            int sign = (num >= 0) ? 1 : -1; // get the sign of the number
            num = Math.abs(num); // make the number positive

            int reverse = 0;
            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            reverse *= sign; // restore the sign of the number

            System.out.println("The reverse of the signed number is: " + reverse);
        }
    }

