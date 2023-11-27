package Hashmap;
import java.util.*;
public class MostFrequentElement {
    static int freqElement(int []a,int n)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!mp.containsKey(a[i]))
            {
                mp.put(a[i],1);
            }
            else
            {
                mp.put(a[i],mp.get(a[i])+1);
            }
        }
        System.out.println(mp.entrySet());
        int max=-1;
        int key=0;
        for(var e:mp.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                key=e.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int []a={1,3,3,2,3,1,4,1};
        System.out.println(freqElement(a,a.length));
    }
}
