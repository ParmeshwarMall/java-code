package Recursion;

public class FindLastOccurenceOfArray {
    static int idx(int a[], int i, int target) {
        if(i==a.length)
        {
            return -1;
        }
        int lo=idx(a,i+1,target);
        if(lo==-1 && a[i]==target)
        {
            return i;
        }
        return lo;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,2,1,3};
        int t=3;
        int idx=idx(a,a.length-1,t);
        if(idx>=0)
        {
            System.out.printf("%d found at index: "+idx,t);
        }
        else System.out.printf("%d not found in the given array",t);
        System.out.println();
    }
}
