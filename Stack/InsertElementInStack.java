package Stack;
import java.util.*;
public class InsertElementInStack {
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
        System.out.print("Enter element that want to insert: ");
        int e=sc.nextInt();
        System.out.print("Enter the position: ");
        int p=sc.nextInt();

        Stack<Integer> st2=new Stack<>();
        while(st1.size()>p)
        {
            int x=st1.peek();
            st2.push(x);
            st1.pop();
        }
        st1.push(e);
        while(st2.size()>0)
        {
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
}
