package Backtracking;

public class PermutationOfString {
    static void printP(String s,String t)
    {
        if(s.equals(""))
        {
            System.out.println(t);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String rem=left+right;
            printP(rem,t+ch);
        }
    }

    public static void main(String[] args) {
        printP("abc","");
    }
}
