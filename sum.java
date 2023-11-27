import java.util.*;
public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        //System.out.println(sum);
    }
}
