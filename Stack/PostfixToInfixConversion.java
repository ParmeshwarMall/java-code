package Stack;
import java.util.*;
public class PostfixToInfixConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the postfix expression:");
        String s=sc.next();
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57)
            {
                String s1=""+ch;
                st.push(s1);
            }
            else
            {
                String c2=st.pop();
                String c1=st.pop();
                String ans='('+c1+ch+c2+')';
                st.push(ans);
            }
        }
        System.out.println(st.peek());
    }
}
