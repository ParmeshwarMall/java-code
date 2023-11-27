package LinkedList;

public class FindMiddleElement {
    public static class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static int middle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)      // For even length case return right middle
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(1);
        Node c=new Node(3);
        Node d=new Node(8);
        Node e=new Node(20);
        Node f=new Node(20);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(middle(a));
    }
}
