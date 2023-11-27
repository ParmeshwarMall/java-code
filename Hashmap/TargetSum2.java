package Hashmap;
import java.util.HashMap;

public class TargetSum2 {
    static int [] target(int a[],int t)
    {
        int n=a.length;
        int []ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int part=t-a[i];
            if(mp.containsKey(part))
            {
                ans=new int[]{i,mp.get(part)};
                return ans;
            }
            else mp.put(a[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={14,7,10,4,5,9,1,2};
        int [] ans=target(a,15);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
