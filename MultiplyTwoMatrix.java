import java.util.*;
public class MultiplyTwoMatrix {
    static void printMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulMatrix(int a1[][], int r1, int c1, int a2[][], int r2, int c2) {
        int mul[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a1[i][k] * a2[k][j]);
                }
            }
        }
        printMatrix(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no. of first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter column no. of first matrix");
        int c1 = sc.nextInt();
        System.out.println("Enter matrix");
        int a1[][] = new int[r1][c1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter row no. of second matrix");
        int r2 = sc.nextInt();
        System.out.println("Enter column no. of second matrix");
        int c2 = sc.nextInt();
        if (r2 != c1) {
            System.out.println("Multiplication not possible: Enter a valid matrix");
            return;
        }
        System.out.println("Enter matrix");
        int a2[][] = new int[r1][c1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your multiplication matrix is: ");
        mulMatrix(a1, r1, c1, a2, r2, c2);
    }
}
