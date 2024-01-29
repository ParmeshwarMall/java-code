package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallerElement {
    static int[] PSE(int []a,int n)
    {
        Stack<Integer> st=new Stack<>();
        int []ans=new int[n];
        st.push(a[0]);
        ans[0]=-1;
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && st.peek()>a[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(a[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter element: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[]ans=PSE(a,n);
        System.out.println("Ele    PSE");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+"      "+ans[i]);
        }
    }
}
