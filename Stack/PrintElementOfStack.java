package Stack;
import java.util.*;
public class PrintElementOfStack {

    static void printRecursively(Stack<Integer> st1)
    {
        if(st1.size()==0)
        {
            return;
        }
        int e=st1.pop();
        printRecursively(st1);
        System.out.print(e+" ");
        st1.push(e);
    }
    static void printReverseRecursively(Stack<Integer> st1)
    {
        if(st1.size()==0)
        {
            return;
        }
        int e=st1.pop();
        System.out.print(e+" ");
        printReverseRecursively(st1);
        st1.push(e);
    }
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);
        st1.push(3);
        st1.push(5);
        st1.push(7);

        Stack<Integer> st2=new Stack<>();
        while(st1.size()>0)
        {
            st2.push(st1.pop());
        }
        while(st2.size()>0)
        {
            System.out.print(st2.peek()+" ");
            st1.push(st2.pop());
        }
        System.out.println();
        System.out.println(st1);
        printReverseRecursively(st1);
        System.out.println();
        printRecursively(st1);
    }
}
