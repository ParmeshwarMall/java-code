package LinkedList;

public class MergeTwoSortedLL {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    static Node mergeSort(Node h1,Node h2)
    {
        Node t1=h1;
        Node t2=h2;
        Node a=new Node(100);
        Node t=a;
        while(t1!=null && t2!=null)
        {
            if(t1.data<t2.data)
            {
                t.next=t1;
                t=t1;
                t1=t1.next;
            }
            else
            {
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null)
        {
            t.next=t2;
        }
        if(t2==null)
        {
            t.next=t1;
        }

        t=a;
        return t.next;
    }

}
