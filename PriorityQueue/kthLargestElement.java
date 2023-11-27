package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        int k=2;
        l.add(10);
        l.add(20);
        l.add(25);
        l.add(5);
        l.add(15);

//        l.sort(Comparator.reverseOrder());
//        System.out.println(l);
//        System.out.println(l.get(k-1));    // Using list


        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<l.size();i++)
        {
            if(pq.size()==k)
            {
                if(pq.peek()<l.get(i))
                {
                    pq.remove();
                    pq.add(l.get(i));
                }
            }
            else pq.add(l.get(i));
        }

        System.out.println(pq.peek());    // Using Priority Queue

    }
}
