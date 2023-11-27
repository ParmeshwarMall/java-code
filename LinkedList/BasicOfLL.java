package LinkedList;

public class BasicOfLL {
    static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static void printRecursively(Node head)
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        System.out.print(temp.data+" ");
        printRecursively(temp.next);
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
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

       // print(a);
        printRecursively(a);
    }
}
