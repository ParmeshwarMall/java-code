package Stack;

import java.util.Stack;
import java.util.*;
public class PostfixExpressionEvaluation {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a postfix expression:");
         String s=sc.next();
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             int ascii=(int)ch;
             if(ascii>=48 && ascii<=57)
             {
                 st.push(ascii-48);
             }
             else
             {
                 int val2=st.pop();
                 int val1=st.pop();
                 if(s.charAt(i)=='+')
                     st.push(val1+val2);
                 if(s.charAt(i)=='-')
                     st.push(val1-val2);
                 if(s.charAt(i)=='*')
                     st.push(val1*val2);
                 if(s.charAt(i)=='/')
                     st.push(val1/val2);
             }
         }
        System.out.println("Ans= "+st.peek());
    }
}
