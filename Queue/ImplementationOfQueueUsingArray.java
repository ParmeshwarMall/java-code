package Queue;

public class ImplementationOfQueueUsingArray {
    public static class queueA
    {
        int f=-1;
        int r=-1;
        int size=0;
        int []a=new int[10];
        void add(int val)
        {
            if(r==a.length)
            {
                System.out.println("Queue is full");
                return;
            }
            if(f==-1)
            {
                f=r=0;
                a[0]=val;
            }
            else
            {
                a[r+1]=val;
                r++;
            }
            size++;
        }

        int remove()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int x=a[f];
            f++;
            size--;
            return f;
        }

        void size()
        {
            System.out.println(size);
        }

        int peek()
        {
            if(size==0)
            {
                System.out.println("Queue if empty");
                return -1;
            }
            return a[f];
        }

        boolean isEmpty()
        {
            if(size==0)
                return true;
            else return false;
        }

        void display()
        {
            if(size==0)
            {
                System.out.print("Queue is empty");
            }
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q=new queueA();
        q.display();
        q.size();
        q.add(3);
        q.add(8);
        q.add(10);
        q.display();
        q.size();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
