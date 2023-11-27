import java.util.*;
public class RemoveOccurenceOfString {
    static String remOcc(String s,int idx,char target)
    {
        if(idx>=s.length())
            return "";

        String ans1=remOcc(s,idx+1,target);

        if(s.charAt(idx)!=target)
        {
             return s.charAt(idx)+ans1;
        }
        else
        {
            return ans1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the char you want to remove");
        char target=sc.next().charAt(0);
        System.out.println(remOcc(s,0,target));
    }
}
