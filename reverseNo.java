import java.util.*;
public class reverseNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        while(num>0)
        {
            i=i*10+num%10;
            num=num/10;

        }
        System.out.println("Reverse No. is "+i);
    }
}
