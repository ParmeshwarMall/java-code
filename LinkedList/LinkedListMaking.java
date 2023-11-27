package LinkedList;

public class LinkedListMaking {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class LinkedList
    {
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
            }
            tail=temp;
        }

        void insertAtStarting(int val)
        {
            Node temp=new Node(val);
            if(head==null)      // For empty linkedList
            {
                head=tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
        }

        void insertAtIndex(int idx,int val)
        {
            Node t=new Node(val);
            Node temp=head;
            if(idx==size())
            {
                insertAtEnd(val);
                return;
            }
            if(idx==0)
            {
                insertAtStarting(val);
                return;
            }
            for(int i=1;i<idx;i++)
            {
                temp=temp.next;
            }
                t.next=temp.next;
                temp.next=t;
        }
        void deleteAtIndex(int idx)
        {
            Node temp=head;
            if(idx==0)
            {
                head=head.next;
                return;
            }
            for(int i=1;i<idx;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size()-1)
            {
                tail=temp;
            }
        }
        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(5);
        //ll.display();
        ll.insertAtEnd(8);
        //ll.display();
        ll.insertAtEnd(15);
        //ll.display();
        ll.insertAtStarting(20);
        ll.display();
        //System.out.println("Size of LinkedList= "+ll.size());
        ll.insertAtIndex(4,50);
        ll.display();
        //System.out.println(ll.getAt(2));
        ll.deleteAtIndex(0);
        ll.display();
    }
}
