import java.util.ArrayList;
public class LinearSearchUsingArrayList {
    static ArrayList<Integer> index(int a[],int idx,int target)
    {
        if(idx>=a.length)
            return new ArrayList<Integer>();


        ArrayList<Integer> ans=new ArrayList<>();
        if(a[idx]==target)
        {
            ans.add(idx);
        }

        ArrayList<Integer> smallAns=index(a,idx+1,target);
        ans.addAll(smallAns);

        return ans;

    }

    public static void main(String[] args) {
        int a[]={1,2,3,2,5,2};
        int target=2;
        System.out.println("Index at which target present:");
        System.out.println(index(a,0,target));
    }
}
