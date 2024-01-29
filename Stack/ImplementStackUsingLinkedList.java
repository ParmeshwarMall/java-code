package Stack;

public class ImplementStackUsingLinkedList {
    public static class Node      // User define datatype
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static class Stack     //User define dataStructure
    {
        Node head=null;
        int size=0;
        void push(int data)
        {
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        void displayRec(Node h)
        {
            Node temp=h;
            if(temp==null)
                return;
            displayRec(h.next);
            System.out.print(h.data+" ");
        }
        void display()
        {
            displayRec(head);
            System.out.println();
        }
        void displayReverse()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
            }
            Node t=head;
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.println();
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        int size()
        {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.display();
        st.pop();
        st.pop();
        st.display();
        System.out.println("Top element= "+st.peek());
        st.push(50);
        st.display();
        System.out.println("Size= "+st.size());
    }
}
