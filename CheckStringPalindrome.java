import java.util.Scanner;

public class CheckStringPalindrome {

        static String reverse(String s,int idx)
        {
            if(idx==s.length())
                return "";

            String smallAns=reverse(s,idx+1);
            return smallAns+s.charAt(idx);


        }

        static boolean isPalindrome(String s)
        {
            int n=s.length();
            for(int i=0;i<s.length()/2;i++)
            {
                if(s.charAt(i)!=s.charAt(n-1-i))
                    return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter String");
            String s=sc.nextLine();
            System.out.println(isPalindrome(s));
            String rev=reverse(s,0);
            if(rev.equals(s)) {
                System.out.printf("%s is Palindrome", s);
            }
            else {
                System.out.printf("%s is not Palindrome", s);
            }

        }
    }

