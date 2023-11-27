package Hashmap;
import java.util.*;
public class MaximumLengthSumZero {
    static int mxLength(int a[])
    {
        int n=a.length;
        int mxLen=0;
        int prefSum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            prefSum+=a[i];
            if(mp.containsKey(prefSum))
            {
                mxLen=Math.max(i,i-mp.get(prefSum));
            }
            else mp.put(prefSum,i);
        }
        return mxLen;
    }

    public static void main(String[] args) {
        int []a={15,-2,2,-8,1,7,10,23};
        System.out.println(mxLength(a));
    }
}
