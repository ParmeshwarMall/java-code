import java.util.*;
public class maxValue {
    static int maximum(int a[],int n) {
        int MAX = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>MAX)
            {
                MAX=a[i];
            }
        }

        return MAX;
    }

    static int secondMaximum(int a[],int n)
    {
        int MAX=maximum(a,n);
        for(int i=0;i<n;i++)
        {
            if(a[i]==MAX)
            {
                a[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=maximum(a,n);
        //System.out.println(secondMax);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" element of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //System.out.println("Maximum No.= "+maximum(a,n));
        System.out.println("Second Max= "+secondMaximum(a,n));

    }
}
