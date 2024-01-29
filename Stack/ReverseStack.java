package Stack;

import java.util.Stack;

public class ReverseStack {

    static void pushAtBottom(Stack<Integer> st1,int n)
    {
        if(st1.size()==0)
        {
            st1.push(n);
            return;
        }
        int top=st1.pop();
        pushAtBottom(st1,n);
        st1.push(top);
    }
    static void reverse(Stack<Integer> st1)
    {
        if(st1.size()==1)
        {
            return;
        }
        int top=st1.pop();
        reverse(st1);
        pushAtBottom(st1,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);
//        Stack<Integer> st2=new Stack<>();    // Reverse using iteration
//        while(st1.size()!=0)
//        {
//            st2.push(st1.pop());
//        }
//        System.out.println(st2);
        reverse(st1);                        // Reverse using recursion
        System.out.println(st1);
    }
}
