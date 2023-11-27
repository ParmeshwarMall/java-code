package GreedyAlgorithm;

public class BestTimeToBuyAndSellStock {
    static int best(int []price)
    {
        int maxProfit=0;
        int buy=price[0];
        for(int i=0;i< price.length;i++)
        {
            if(buy>price[i])
            {
                buy=price[i];
            }
            else if(price[i]-buy>maxProfit)
            {
                maxProfit=price[i]-buy;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int []price={7,1,5,3,6,4};
        int[]p2={5,4,3,2,1};
        System.out.println("Max profit is: "+best(price));
        System.out.println(best(p2));
    }
}
