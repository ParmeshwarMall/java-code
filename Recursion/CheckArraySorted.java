package Recursion;

public class CheckArraySorted {
    static boolean isSorted(int a[],int i)
    {
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i]>a[i+1])
        {
            return false;
        }
        return isSorted(a,i+1);
    }

    public static void main(String[] args) {
        int a[]={1,2,9,4,5};
        if(isSorted(a,0))
        {
            System.out.println("Given array is sorted");
        }
        else System.out.println("Given array is not sorted");
    }
}
