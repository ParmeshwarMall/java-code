package Stack;
import java.util.*;
import java.util.Stack;

public class InfixExpressionSolve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57)
            {
                val.push(ascii-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(')
            {
                op.push(ch);
            }
            else if(ch==')')
            {
                while(op.peek()!='(')
                {
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else
            {
                if(ch=='+' || ch=='-')
                {
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/')
                {
                    if(op.peek()=='*' || op.peek()=='/')
                    {
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1)
        {
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
