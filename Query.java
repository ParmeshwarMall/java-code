import java.util.*;
public class Query
{
    static int [] makeFrequencyArray(int a[])
    {
        int freq[]=new int[100001];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int freq[]=makeFrequencyArray(a);
        System.out.println("Enter no. of Queries");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.print("Enter the no.to be searched: ");
            int x=sc.nextInt();
            if(freq[x]>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            q--;
        }
    }
}
