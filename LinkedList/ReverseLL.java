package LinkedList;

public class ReverseLL {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    static void reverse(Node head)
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        reverse(temp.next);
        System.out.print(temp.data+" ");
    }

    static void display(Node head)
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println();
            return;
        }
        System.out.print(temp.data+" ");
        display(temp.next);
    }
    static Node reverseLL(Node head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node newhead=reverseLL(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        reverse(a);
        System.out.println();
        a=reverseLL(a);
        display(a);
    }
}
