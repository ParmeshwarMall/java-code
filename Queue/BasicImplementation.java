package Queue;
import java.util.*;
public class BasicImplementation {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Size= "+q.size());
       System.out.println(q);
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("Peek= "+q.peek());
        System.out.println("Size= "+q.size());
        System.out.println(q.isEmpty());
    }
}
