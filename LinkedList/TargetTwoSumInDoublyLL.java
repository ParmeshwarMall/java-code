package LinkedList;

public class TargetTwoSumInDoublyLL {
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

    static void targetSum(Node head,int tar)
    {
        Node t1=head;
        while(t1.next!=null)
        {
            t1=t1.next;
        }
        Node t2=head;
        while(t2.val<t1.val)
        {
            if(t2.val+t1.val==tar)
            {
                System.out.print(t2.val+" ");
                System.out.println(t1.val);
                break;
            }
            else if(t2.val+t1.val<tar)
            {
                t2=t2.next;
            }
            else
            {
                t1=t1.prev;
            }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(10);
        Node d = new Node(18);
        Node e = new Node(20);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        targetSum(a,24);
    }
}
