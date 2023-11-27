package GreedyAlgorithm;

import java.util.*;

public class MaximumActivity {
    public static void main(String[] args) {

        // If ending time is sorted

        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

//        int maxAct=0;
//        int lastEnd=end[0];
//
//        List<Integer> ans=new ArrayList<>();
//        maxAct=1;       // Select first pair
//        ans.add(0);
//
//        for(int i=0;i<end.length;i++)
//        {
//            if(start[i]>=lastEnd)
//            {
//                maxAct++;
//                ans.add(i);
//                lastEnd=end[i];
//            }
//        }
//
//        System.out.println("Max activity preform: "+maxAct);
//        for(int i=0;i<ans.size();i++)
//        {
//            System.out.print("A"+ans.get(i)+" ");
//        }

        //If ending time is not sorted

        int act[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }
        // Lambda function
        Arrays.sort(act,Comparator.comparingDouble(o->o[2]));  // sort according to 2nd column means ending idx

        int maxAct=0;

        List<Integer> ans=new ArrayList<>();
        maxAct=1;
        int lastEnd=act[0][2];
        ans.add(act[0][0]);

        for(int i=0;i<end.length;i++)
        {
            if(act[i][1]>=lastEnd)
            {
                maxAct++;
                ans.add(act[i][0]);
                lastEnd=act[i][2];
            }
        }

        System.out.println("Max activity preform: "+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
