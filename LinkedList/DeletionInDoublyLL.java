package LinkedList;

public class DeletionInDoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    static Node deleteHead(Node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    static void deleteTail(Node head)
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    static void deleteAtIndex(Node head,int idx) {
        Node temp = head;
        for (int i = 1; i < idx; i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
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

//        Node t=deleteHead(a);
//        display1(t);
//        deleteTail(a);
//        display1(a);
        deleteAtIndex(a,2);
        display1(a);
    }
}
