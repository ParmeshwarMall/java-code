import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(14);
        list.add(15);
        list.add(12);
        list.add(13);

        System.out.println("Original List:");
        System.out.println(list);
        System.out.println("Ascending order:");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Descending order:");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
