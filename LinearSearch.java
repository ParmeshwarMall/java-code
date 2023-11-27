public class LinearSearch {
    static int search(int a[],int n, int target)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==target) {
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int x = search(a, 5, 8);
        if (x >0)
            System.out.println("Element present at index:"+x);
        else System.out.println("Element not present");
    }
}
