import java.util.*;
public class conditional {
    public static void main(String[] args){
        System.out.println("Enter No.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            if(num%3==0) {
                System.out.println("True Value");
            }
            else {
                System.out.println("False Value");
            }
        }

    }
}
