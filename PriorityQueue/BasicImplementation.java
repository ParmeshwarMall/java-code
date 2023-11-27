package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicImplementation {

    static class student{
        String name;
        int marks;
        int rollNo;
    }

    static class StudentComparator implements Comparator<student>{  // User define comparison
        public int compare(student s1,student s2)
        {
            if(s1.marks>s2.marks)
            {
                return -1;
            }
            else if(s1.marks<s2.marks)
            {
                return 1;
            }
            else
            {
                if(s1.rollNo>s2.rollNo)
                    return 1;
                else return -1;
            }
        }
    }
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();      // For min heap
//        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());    //For max heap
//        pq.add(10);
//        pq.add(40);
//        pq.add(24);
//        pq.add(28);
//
//        System.out.println(pq.peek());
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq);

        PriorityQueue<student> stu=new PriorityQueue<>(new StudentComparator());
        student s1=new student();
        s1.name="Ram";
        s1.marks=98;
        s1.rollNo=1;

        student s2=new student();
        s2.name="Shyam";
        s2.marks=98;
        s2.rollNo=2;

        stu.add(s1);
        stu.add(s2);

        System.out.println(stu.peek().name);
    }
}
