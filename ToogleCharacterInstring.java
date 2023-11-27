import java.util.*;
public class ToogleCharacterInstring {

    static void toggle(StringBuilder sb)
    {
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            int asci=(int)ch;
            boolean flag=true;
            if(asci>=97)
            {
                flag=false;
            }
            if(flag==true)
            {
                asci+=32;
                char tc=(char)asci;
                sb.setCharAt(i,tc);
            }
            else
            {
                asci-=32;
                char tc=(char)asci;
                sb.setCharAt(i,tc);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        toggle(sb);

    }
}
