import java.util.*;
public class Countdigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x=0;
        while(num>0)
        {
            num=num/10;
            x++;
        }
        System.out.println("No. Of Digit="+x);
    }
}
