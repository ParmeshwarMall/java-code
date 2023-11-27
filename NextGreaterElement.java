public class NextGreaterElement {
    static int[] nextGE(int []a)
    {
        int n=a.length;
        int []b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=-1;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    b[i]=a[j];
                    break;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int a[]={1,3,2,1,8,6,3,4};
        int ans[]=nextGE(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
