public class PrintArrayUsingRecursion {
    static void printArray(int a[], int idx)
    {
        if(idx==a.length)
            return;

        System.out.println(a[idx]);
        printArray(a,idx+1);
    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
       printArray(a,0);

    }
}
