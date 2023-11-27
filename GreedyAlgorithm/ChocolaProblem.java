package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer[] horCost={4,1,2};
        Integer[] verCost={2,1,3,1,4};

        Arrays.sort(horCost, Collections.reverseOrder());
        Arrays.sort(verCost,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;    // hp=Horizontal piece  ,, vp=vertical piece
        int cost=0;

        while(h< horCost.length && v< verCost.length)
        {
            if(verCost[v]<=horCost[h])   // horizontal cut
            {
                cost+=(horCost[h]*vp);
                hp++;
                h++;
            }
            else
            {
                cost+=(verCost[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<horCost.length)
        {
            cost+=(horCost[h]*vp);
            hp++;
            h++;
        }
        while(v<verCost.length)
        {
            cost+=(verCost[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Min cost for cuts: "+cost);
    }
}
