import java .util.*;
public class PowerOfNumber {
    static int pow(int p,int q)   // 1st method
    {
        if(q==0)
            return 1;
        return pow(p,q-1)*p;
    }

    static int power(int p,int q)    // 2nd method
    {
        if(q==0)
            return 1;

        int smallPow=power(p,q/2);
        if(q%2==0)
            return smallPow*smallPow;
        else
            return p*smallPow*smallPow;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int p=sc.nextInt();
        System.out.println("Enter power");
        int q=sc.nextInt();
        //System.out.println("Ans= "+pow(p,q));  Time Complexity=O(q)
        System.out.println("Ans= "+power(p,q)); // Time Complexity=O(log(q))
    }
}
