package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpam {
    static int[] stockSpam(int []p,int n)
    {
        Stack<Integer> st=new Stack<>();
        int []ans=new int[n];
        st.push(0);
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && p[st.peek()]<p[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=i+1;
            }
            else ans[i]=i-st.peek();
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of days: ");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter price: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[]ans=stockSpam(a,n);
        System.out.println("Price      Spam");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+"         "+ans[i]);
        }
//        System.out.println();
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(ans[i]+" ");
//        }
    }
}
