import java.util.*;
public class factorial
{
        public static void main(String args[])
        {
    long i,fact=1;
    Scanner sc=new Scanner(System.in);
    long x=sc.nextInt();
    for(i=1;i<=x;i++){
        fact=fact*i;
    }
    System.out.println("Factorial of "+x+" is: "+fact);
}
}
