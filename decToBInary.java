import java.util.*;
public class decToBInary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal no.");
        int d=sc.nextInt();
        String ans="";
        int p=1;
        while(d>0)
        {
            int parity=d%2;
            ans+=(parity*p);
            p*=10;
            d/=2;
        }
        System.out.println(ans);
    }
}
