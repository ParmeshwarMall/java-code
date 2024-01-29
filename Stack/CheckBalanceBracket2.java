package Stack;
import java.util.*;
public class CheckBalanceBracket2 {
    static int bracket(String s)
    {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                st.push('(');
            if(st.size()==0 && ch==')')
            {
                count++;
            }
            if(st.size()!=0)
            {
                if(ch==')')
                    st.pop();
            }
        }
        return st.size()+count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(bracket(s));
    }
}
