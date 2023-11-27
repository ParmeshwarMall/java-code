public class countOccurence
{
    public static void main(String[] args) {
        int x=5;
        int count=0;
        int a[]={5,5,2,5,4};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("No. of 5 in array= "+count);
    }
}
