package Hashset;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int LCS(int []a)
    {
        HashSet<Integer> st = new HashSet<>();
        int mxLength=0;
        for(int num:a)
        {
            st.add(num);
        }
        for(int num:st)
        {
            if(!st.contains(num-1))
            {
                int currNum=num;
                int currLength=1;
                while(st.contains(currNum+1)) {
                    currNum++;
                    currLength++;
                }

                mxLength=Math.max(currLength,mxLength);
            }

        }
        return mxLength;
    }

    public static void main(String[] args) {
        int a[]={100,4,200,1,3,2};
        System.out.println(LCS(a));
    }
}
