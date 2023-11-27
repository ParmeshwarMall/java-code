package Queue;
import java.util.*;
public class ImplementQueueUsingStack {

    static class QueueS
    {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        void add(int val)
        {
            st1.push(val);
        }
        int remove()
        {
            while(st1.size()!=0)
            {
                st2.push(st1.pop());
            }
            int x=st2.pop();
            while(st2.size()!=0)
            {
                st1.push(st2.pop());
            }
            return x;
        }
        int peek()
        {
            while(st1.size()!=0)
            {
                st2.push(st1.pop());
            }
            int x=st2.peek();
            while(st2.size()!=0)
            {
                st1.push(st2.pop());
            }
            return x;
        }
        void display()
        {
            System.out.print(st1);
        }
    }

    public static void main(String[] args) {
        QueueS q=new QueueS();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
    }
}
