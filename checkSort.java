public class checkSort
{
    public static void main(String[] args) {
        int f=0;
        int a[]={5,6,7,8,9,};
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Array is not sort");
        }
        else
        {
            System.out.println("Array is sorted");
        }
    }
}
