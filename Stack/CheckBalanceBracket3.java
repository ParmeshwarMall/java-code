package Stack;
import java.util.*;
public class CheckBalanceBracket3 {
    static boolean isBalance(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.size() == 0) {
                    return false;
                }
                if (ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[') {
                    st.pop();
                }
                else return false;
            }
        }
        if(st.size()>0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isBalance(s));
    }
}
