import java.util.*;
public class SubsetOfArrayElement {
    static void subset(int a[],List<Integer>l,List<List<Integer>>ans,int i)
    {
        if(i==a.length)
        {
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(a[i]);
        subset(a,l,ans,i+1);
        l.remove(l.size()-1);
        subset(a,l,ans,i+1);
    }

    static List<List<Integer>> helper(int a[])
    {
        List<List<Integer>>fans=new ArrayList<>();
        subset(a,new ArrayList<>(),fans,0);
        return fans;
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        System.out.println(helper(a));
    }
}
