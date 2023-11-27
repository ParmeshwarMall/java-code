package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumPlatform {
    public static void main(String[] args) {
        int arr[]={900,940,950,1100,1500,1800};
        int dep[]={910,1200,1120,1130,1900,2000};

        int train[][]=new int[arr.length][2];
        for(int i=0;i<arr.length;i++)
        {
            train[i][0]=arr[i];
            train[i][1]=dep[i];
        }
        // Lambda function
        Arrays.sort(train, Comparator.comparingDouble(o->o[1]));

        int plat=0;

    }
}
