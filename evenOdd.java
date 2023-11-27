import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args)
    {
        System.out.println("Enter the No.");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even No.");
        }
        else
        {
            System.out.println("Odd No.");
        }
    }
}
