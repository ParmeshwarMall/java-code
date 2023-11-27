package LinkedList;

public class CheckPalindromeDoublyLL {
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

    static boolean isPalindrome(Node head)
    {
        Node temp1=head;
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        Node temp2=head;
        while(temp1!=temp2)
        {
            if(temp2.val!=temp1.val)
            {
                return false;
            }
            temp2=temp2.next;
            temp1=temp1.prev;

        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(10);
        Node d = new Node(18);
        Node e = new Node(14);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println(isPalindrome(a));
    }

}
