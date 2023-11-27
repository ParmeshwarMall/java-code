package LinkedList;
import java.util.*;
public class TakeLLInputAndPrint {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    static void display(Node head)
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static class LinkedList
    {
        Node head=null;
        Node tail=null;
        Node insertAtStarting(int val)
        {
            Node temp=new Node(val);
            if(head==null)      // For empty linkedList
            {
                head=tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
            return head;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++)
        {
            head=ll.insertAtStarting(sc.nextInt());
        }

        display(head);
    }
}
