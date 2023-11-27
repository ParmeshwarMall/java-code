public class FabonacciSeries {
    static int []a(int n)
    {
        int a[]=new int [n];
         a[0]=0;
         a[1]=1;

        for(int i=2;i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]=a(5);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}