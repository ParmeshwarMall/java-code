package Recursion;

public class FirstOccurenceOfElementInArray {
    static int idx(int a[], int i, int target) {
        if (a[i] == target) {
            return i;
        } else if (i == a.length-1) {
            return -1;
        }
        return idx(a, i + 1, target);
    }

    public static void main(String[] args) {
        int a[]={1,2,4,2,1,3};
        int t=3;
        int idx=idx(a,0,t);
        if(idx>=0)
        {
            System.out.printf("%d found at index: "+idx,t);
        }
        else System.out.printf("%d not found in the given array",t);
        System.out.println();
    }
}
