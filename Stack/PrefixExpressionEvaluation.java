package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixExpressionEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prefix expression:");
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57)
            {
                st.push(ascii-48);
            }
            else
            {
                int val1=st.pop();
                int val2=st.pop();
                if(ch=='+')
                    st.push(val1+val2);
                if(ch=='-')
                    st.push(val1-val2);
                if(ch=='*')
                    st.push(val1*val2);
                if(ch=='/')
                    st.push(val1/val2);
            }
        }
        System.out.println("Ans= "+st.peek());
    }
}
