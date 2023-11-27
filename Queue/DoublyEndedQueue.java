package Queue;
import java.util.*;
public class DoublyEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(8);
        System.out.println(dq);
        dq.addFirst(10);
        dq.addFirst(15);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }
}
