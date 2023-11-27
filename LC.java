import java.util.*;
public class LC {
    static int myAtio(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57)
            {
                int n=ascii-48;
                ans+=n*10;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        myAtio("1234");
    }
}
