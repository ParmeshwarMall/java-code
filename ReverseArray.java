public class ReverseArray {
    /*public static void main(String[] args) {
        int j=0;

        int ans[]=new int[5];
        int a[]={1,2,3,4,5};
        for(int i=4;i>=0;i--)
        {
          ans[j++]=a[i];

        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }*/
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int[] printReverse(int a[])
    {
        int n=a.length;
        int [] ans=new int[5];
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            ans[j++]=a[i];
        }
        return ans;
    }

    static void reverseUsingSwap(int a[])
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        printArray(a);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //int ans[]=printReverse(a);
        reverseUsingSwap(a);
        //printArray(ans);
    }
}
