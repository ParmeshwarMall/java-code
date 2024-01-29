package Stack;
import java.util.*;
public class InfixToPrefixConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter infix expression");
        String inf=sc.next();
        Stack<String> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<inf.length();i++)
        {
            char ch=inf.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57)
            {
                String s=""+ch;
                st.push(s);
            }
            else if (op.size()==0 || ch=='(' || op.peek()=='(')
            {
                op.push(ch);
            }
            else if(ch==')')
            {
                while(op.peek()!='(')
                {
                    String v2=st.pop();
                    String v1=st.pop();
                    char o=op.pop();
                    String s=o+v1+v2;
                    st.push(s);
                }
                op.pop();
            }
            else
            {
                if(ch=='+' || ch=='-')
                {
                    String v2=st.pop();
                    String v1=st.pop();
                    char o=op.pop();
                    String s=o+v1+v2;
                    st.push(s);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/')
                {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String s = o + v1 + v2;
                        st.push(s);
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }
                }
            }
        }
        while(st.size()>1)
        {
            String v2=st.pop();
            String v1=st.pop();
            char o=op.pop();
            String s=o+v1+v2;
            st.push(s);
        }
        System.out.println(st.peek());
    }
}
