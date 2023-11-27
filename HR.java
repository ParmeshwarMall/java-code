import java.util.*;
public class HR
{
   public static class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
       }
   }
    public static class LinkedList
    {
        Node head=null;
        Node tail=null;
        Node insert(int data)
        {
            Node t=new Node(data);
            if(head==null)
            {
                head=t;
            }
            else
            {
                tail.next=t;
            }
            tail=t;
            return head;
        }
    }
   static Node LL(Node head,int pos)
   {
       Node temp=head;
       for(int i=1;i<pos;i++)
       {
           temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n=sc.nextInt();
        Node head1=null;
        for(int i=0;i<n;i++)
        {
            head1=ll.insert(sc.nextInt());
        }
        int pos=sc.nextInt();
        Node t=LL(head1,pos);
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
