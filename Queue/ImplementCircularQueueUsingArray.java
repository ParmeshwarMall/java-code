package Queue;
import java.util.*;
public class ImplementCircularQueueUsingArray {

    public static class CqueueA
    {
        int f=-1;
        int r=-1;
        int size=0;
        int []a=new int[5];

       void add(int val) throws Exception
        {
            if(size==a.length)
            {
                throw new Exception("Queue is full!");
            }
            else if(size==0)
            {
                f=r=0;
                a[r]=val;
            }
            else if (r<a.length-1)
            {
                a[++r]=val;
            }
            else if(r==a.length-1)
            {
                r=0;
                a[0]=val;
            }
            size++;
        }

        int remove() throws Exception
        {
            if(size==0)
            {
                throw new Exception("Queue is empty!");
            }
            else {
                int value = a[f];
                if (f == a.length - 1) f = 0;
                else f++;
                size--;
                return value;
            }
        }

        int peek() throws Exception
        {
            if(size==0)
            {
                throw new Exception("Queue is empty!");
            }
            else return a[f];
        }

        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            else return false;
        }

        void display()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
                return;
            }
            else
            {
                if(f<r)
                {
                    for(int i=f;i<=r;i++)
                    {
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                }
                else
                {
                    for(int i=f;i<a.length;i++)
                    {
                        System.out.print(a[i]+" ");
                    }
                    for(int i=0;i<=r;i++)
                    {
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CqueueA q=new CqueueA();
        q.display();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(8);
        q.display();
        q.remove();
        q.display();
        q.add(10);
        q.display();
        q.add(18);
        q.display();
        q.add(20);
        q.display();
    }
}
