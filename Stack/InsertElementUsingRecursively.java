package Stack;
import java.util.*;
public class InsertElementUsingRecursively {
    static void insert(Stack<Integer> st,int n,int p)   // p-->Position
    {
        if(st.size()==p)
        {
            st.push(n);
            return;
        }
        int x=st.pop();
        insert(st,n,p);
        st.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);

        insert(st,10,2);
        System.out.println(st);
    }
}
