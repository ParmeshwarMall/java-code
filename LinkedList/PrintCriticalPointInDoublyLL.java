package LinkedList;

public class PrintCriticalPointInDoublyLL {
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

    static void criticalPoint(Node head)
    {
        Node temp=head.next;
        while(temp.next!=null)
        {
            if(temp.val>temp.next.val && temp.val>temp.prev.val)
            {
                System.out.print(temp.val+" ");
            }
            if(temp.val<temp.next.val && temp.val<temp.prev.val)
            {
                System.out.print(temp.val+" ");
            }
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;

        criticalPoint(a);
    }
}
