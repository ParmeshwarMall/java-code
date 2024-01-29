package Stack;
import java.util.*;
public class CopyStackElementToOtherInSameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        System.out.print("Enter the no. of element: ");
        int n=sc.nextInt();
        System.out.print("Enter the element: ");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st1.push(x);
        }
        System.out.println(st1);
        Stack<Integer> st2=new Stack<>();
        while(st1.size()>0)
        {
//            int t=st1.peek();
//            st2.push(t);
//            st1.pop();

            st2.push(st1.pop());
        }
        System.out.println(st2);
        Stack<Integer> st3=new Stack<>();
        while(st2.size()>0)
        {
            st3.push(st2.pop());
        }
        System.out.println(st3);
    }
}
