import java.util.Scanner;
import java.util.Random;

public class GussingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! Guess again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Guess again.");
            }
        }
        System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
    }
}

