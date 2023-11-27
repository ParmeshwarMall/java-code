package Hashset;

import java.util.HashSet;

public class CreateHashset {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Tony");
        st.add("Stark");
        st.add("Captain");
        st.add("Tony");

        System.out.println("Element of Hash is: "+st);
        System.out.println("Size of Hash is: "+st.size());
        System.out.println(st.contains("Tony"));
        st.remove("Tony");
        System.out.println("Size of Hash is: "+st.size());
        System.out.println("Element of Hash is: "+st);

       for(String s:st)
       {
           System.out.print(s+" ");
       }
    }
}
