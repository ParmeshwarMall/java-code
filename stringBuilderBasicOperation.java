import java.util.*;
public class stringBuilderBasicOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        System.out.println(s);
        StringBuilder sb=new StringBuilder("TonyStark");
        sb.setCharAt(5,'h');
        System.out.println(sb);

        sb.insert(1,'o');
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.delete(0,4);
        System.out.println(sb);
    }
}
