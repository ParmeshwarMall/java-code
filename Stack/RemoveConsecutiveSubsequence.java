package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutiveSubsequence
{
    static int[] remove(int []a)
    {
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(st.size()==0 || a[i]!=st.peek())
            {
                st.push(a[i]);
            }
            else if(a[i]==st.peek())
            {
                if(i==n-1 || a[i]!=a[i+1])
                {
                    st.pop();
                }
            }
        }
        int []ans=new int[st.size()];
        int m=st.size();
        for(int i=m-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of element:");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.print("Enter element:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int []res=remove(a);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
