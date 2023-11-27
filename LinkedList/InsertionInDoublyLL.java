package LinkedList;

public class InsertionInDoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insertAtStarting(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head.prev=temp;
        head = temp;
        return head;
    }

    static void insertAtEnd(Node head,int val)
    {
        Node temp=head;
        Node tempL=new Node(val);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=tempL;
        tempL.prev=temp;
        temp=tempL;
    }

    static void insertAtIndex(Node head,int idx,int val)
    {
        Node t1=head;
        Node t2=new Node(val);
        for(int i=1;i<idx;i++)
        {
            t1=t1.next;
        }
        t2.next=t1.next;
        t1.next.prev=t2;
        t1.next=t2;
        t2.prev=t1;
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

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(10);
        Node d = new Node(14);
        Node e = new Node(18);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

//        Node t=insertAtStarting(a, 50);
//        display1(t);
//        insertAtEnd(a,100);
//        display1(t);
        insertAtIndex(a,2,100);
        display1(a);
    }
}
