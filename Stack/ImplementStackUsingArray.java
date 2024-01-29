package Stack;

public class ImplementStackUsingArray {
    public static class Stack
    {
        int []a=new int[5];
        int idx=0;

        void push(int n)
        {
            if(isFull())
            {
                System.out.println("Stack is full");
                return;
            }
            a[idx]=n;
            idx++;
        }
        int peek()
        {
            if(idx==0)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return a[idx-1];
        }
        int pop()
        {
            if(idx==0)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=a[idx-1];
            a[idx-1]=0;
            idx--;
            return top;
        }
        void display()
        {
            for(int i=0;i<idx;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        boolean isFull()
        {
            if(idx==a.length)
                return true;
            else return false;
        }
        boolean isEmpty()
        {
            if(idx==0)
                return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.pop();
        st.display();
        st.push(70);
        st.push(90);
        st.display();
        System.out.println("Size= "+st.size());
        System.out.println("Top element= "+st.peek());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.push(100);
    }
}
