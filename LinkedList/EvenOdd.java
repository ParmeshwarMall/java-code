package LinkedList;

public class EvenOdd {
    public static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
        }
    }

    static ListNode EO(ListNode head)
    {
        ListNode even=null;
        ListNode odd=null;
        ListNode tempE=even;
        ListNode tempO=odd;
        ListNode temp=head;
        while(temp!=null)
        {
            tempO.next=temp;
            temp=temp.next;
            tempO=tempO.next;

            tempE.next=temp;
            temp=temp.next;
            tempE=tempE.next;
        }
        even=even.next;
        odd=odd.next;
        temp.next=even;
        return tempO;
    }
}
