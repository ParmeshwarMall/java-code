public class prcatice {
    public static void main(String[] args) {
        int n=1634;
        int temp1=n;
        int c=0;
        while(temp1!=0)
        {
            temp1=temp1/10;
            c++;
        }
        int temp2=n;
        int ans=0;
        while(temp2!=0)
        {
            int r=temp2%10;
            ans+=Math.pow(r,c);
            temp2=temp2/10;
        }
        if(ans==n)
            System.out.println("Armstrong");
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
