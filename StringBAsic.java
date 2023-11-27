import java.util.*;
public class StringBAsic {
    public static void main(String[] args) {
//        char[] ch = {'a', 'b', 'c', 'd'};
//        String s1 = "abcd";
//        String[] s2 = {"raj", "ram"};
//        String s3 = new String("xyz");
//        System.out.println(ch);
//        System.out.println(s1);
//        for(int i=0;i<2;i++)
//        {
//            System.out.print(s2[i]+" ");
//        }
//        System.out.println();

        String name="Parmeshwar";
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('r'));
        System.out.println(name.contains("mes"));
        System.out.println(name.startsWith("Pa"));
        System.out.println(name.endsWith("wer"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String s1="Raj";
        String s2="Mall";
        System.out.println(s1.concat(s2));
//        for(int i=0;i<name.length();i++)
//        {
//            System.out.print(name.charAt(i)+" ");
//        }
//
//
//        Scanner sc=new Scanner(System.in);
//        String s4=sc.nextLine();
//        System.out.println(s4);
//        System.out.println(s4.length());
    }
}
