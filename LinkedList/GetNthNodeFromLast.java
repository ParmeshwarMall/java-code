package LinkedList;

public class GetNthNodeFromLast {
    public static class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node nTh(Node head,int x)
    {
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        temp = head;
        for (int i = 1; i < (size - x + 1); i++) {
            temp = temp.next;
        }
        return temp;
    }

    static Node getNode(Node head,int x)     //solve in one traversal
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=x;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(9);
        Node c=new Node(12);
        Node d=new Node(15);

        a.next=b;
        b.next=c;
        c.next=d;
        Node p=nTh(a,2);
        Node q=getNode(a,2);
        System.out.println(p.data);
        System.out.println(q.data);
    }
}
