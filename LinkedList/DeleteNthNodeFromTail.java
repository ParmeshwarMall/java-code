package LinkedList;

public class DeleteNthNodeFromTail {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        static Node deleteNth(Node head,int n)
        {
            Node fast=head;
            Node slow=head;
            for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
            if(fast==null)
            {
                head=head.next;
                return head;
            }
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        static void display(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Node a=new Node(10);
            Node b=new Node(20);
            Node c=new Node(30);
            Node d=new Node(40);
            Node e=new Node(50);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            display(a);
            a=deleteNth(a,1);
            display(a);
        }
    }
}
