import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
    static void reverseList(ArrayList<Integer> list)
    {
        int l=0,r=list.size()-1;
        while(l<r)
        {
            Integer temp=Integer.valueOf(list.get(l));
            list.set(l,list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("Original list:");
        System.out.println(list);
        System.out.println("Reverse list:");
        //reverseList(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
