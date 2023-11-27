public class LinearSearchUsingRecursion {
    static boolean search(int a[], int idx, int target)
    {
        if(idx>=a.length)
        {
            return false;
        }
        if(target==a[idx])
            return true;
       /* if(search(a,idx+1,target))
            return true;
        else
            return false;*/

        return search(a,idx+1,target);
    }

    // Print Index Number where element present

    static int findIndex(int a[], int idx, int target)
    {
        if(idx>=a.length)
            return -1;

        if(target==a[idx])
            return idx;

        return findIndex(a,idx+1,target);
    }

    static void printAllIndex(int a[] ,int idx, int target)
    {
        if(idx>=a.length)
            return;

        if(target==a[idx]) {
            System.out.println(idx);
        }

        printAllIndex(a,idx+1,target);
    }

    public static void main(String[] args) {
        int a[]={1,5,3,4,5,7,5};
        int target=5;
        //System.out.println(search(a,0,target));
        //System.out.println("Element found at index "+findIndex(a,0,target));
        printAllIndex(a,0,target);
    }
}
