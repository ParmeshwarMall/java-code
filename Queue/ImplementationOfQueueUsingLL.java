package Queue;

public class ImplementationOfQueueUsingLL {
    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
            if(head==null)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int peek()
        {
            if(head==null)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        void display() {
            if(head==null)
            {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.add(3);
        q.add(5);
        q.add(9);
        q.add(7);
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
