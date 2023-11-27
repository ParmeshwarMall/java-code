package LinkedList;

public class FindIntersectionOfTwoLL {
    public static class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static int intersection(Node H1,Node H2)
    {
        Node T1=H1;
        Node T2=H2;
        int s1=0;
        int s2=0;
        while(T1!=null)
        {
            s1++;
            T1=T1.next;
        }
        while(T2!=null)
        {
            s2++;
            T2=T2.next;
        }
        T1=H1;
        T2=H2;
        if(s1>s2)
        {
            for(int i=1;i<=(s1-s2);i++)
            {
                T1=T1.next;
            }
        }
        else
        {
            for(int i=1;i<=(s2-s1);i++)
            {
                T2=T2.next;
            }
        }
        while(T1!=T2)
        {
            T1=T1.next;
            T2=T2.next;
        }
        return T1.data;
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        Node g=new Node(90);
        Node h=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        g.next=h;
        h.next=d;

        System.out.println(intersection(a,g));
    }
}
