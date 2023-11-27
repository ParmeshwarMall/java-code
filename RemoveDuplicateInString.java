import java.util.*;
public class RemoveDuplicateInString {
    static String remDup(String s)
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            int temp=0;
            for(int j=0;j<sb.length();j++)
            {
                if(s.charAt(i)==sb.charAt(j))
                {
                    temp++;
                }
            }
            if(temp==0)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(remDup(s));
    }
}
