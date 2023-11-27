package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IndianCoins {
    public static void main(String[] args) {
        Integer []coins={1,2,5,10,20,50,100,500,2000};
        int amount=599;

        Arrays.sort(coins, Comparator.reverseOrder());

        int count=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i< coins.length;i++)
        {
            if(coins[i]<=amount)
            {
                while(coins[i]<=amount)
                {
                    count++;
                    amount-=coins[i];
                    l.add(coins[i]);
                }
            }

        }

        System.out.println("Total No. of min coins is: "+count);
        System.out.println("Coins is: "+l);
    }
}
