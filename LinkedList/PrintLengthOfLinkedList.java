package LinkedList;

public class PrintLengthOfLinkedList {
    static int length(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }

    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(15);
        Node c=new Node(17);
        Node d=new Node(19);
        Node e=new Node(20);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(length(a));
    }
}
