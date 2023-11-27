package LinkedList;

public class BasicOfDoublyLL {
    public static class Node
    {
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val=val;
        }
    }

    public static void display1(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void display2(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    static void display3(Node random)
    {
        Node temp=random;
        while(temp.prev!=null)
        {
            temp=temp.prev;
        }
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(8);
        Node c=new Node(10);
        Node d=new Node(14);
        Node e=new Node(18);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;

        display1(a);
        display2(e);
        display3(c);
    }
}
