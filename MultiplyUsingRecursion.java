import java.util.Scanner;

public class MultiplyUsingRecursion {
    static int mul(int x, int y) {
        if (y == 0)
            return 0;

        return mul(x, y - 1) + x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Ans= " + mul(x, y));
    }
}

