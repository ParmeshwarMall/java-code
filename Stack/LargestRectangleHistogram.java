package Stack;

import java.util.*;

public class LargestRectangleHistogram {
    static int LRH(int []height,int n)
    {
        Stack<Integer> st=new Stack<>();
        int []pse=new int[n];
        int []nse=new int[n];
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && height[st.peek()]>=height[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                pse[i]=-1;
            }
            else
            {
                pse[i]=st.peek();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            st.pop();
        }
        nse[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && height[st.peek()]>=height[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nse[i]=n;
            }
            else
            {
                nse[i]=st.peek();
            }
            st.push(i);
        }
        int max=-1;
        for(int i=0;i<n;i++)
        {
            int area=height[i]*(nse[i]-pse[i]-1);
            if(area>max)
            {
                max=area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rectangle: ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter height of each rectangle: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(LRH(a,n));
    }
}
