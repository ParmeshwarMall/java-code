package Stack;
import java.util.*;
public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(10);
        st.push(17);
        st.push(25);
        st.push(27);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size= "+st.size());
    }

}
