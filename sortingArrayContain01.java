/*import java.util.Scanner;

public class sorting
{
    static void zerosAndOnes(int a[])
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
           if(i<count)
               a[i]=0;
           else
               a[i]=1;
        }

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
        zerosAndOnes(a);
        System.out.println("Sorted Array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}*/


import java.util.*;
public class sortingArrayContain01
{
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
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(a[left]!=0 && a[right]!=1)
            {
                int swap=a[left];
                a[left]=a[right];
                a[right]=swap;
                left++;
                right--;
            }
            if(a[left]==0) {
                left++;
            }
            if(a[right]!=0) {
                right--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
