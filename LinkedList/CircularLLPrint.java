package LinkedList;

public class CircularLLPrint {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    static void display(Node head)
    {
        Node temp=head;
        System.out.print(temp.data+" ");
        temp=temp.next;
        while(temp!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node deleteHead(Node head)
    {
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;

        display(a);
        Node t=deleteHead(a);
        display(t);
    }
}
