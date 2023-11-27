public class PrintNextMultipleOf5 {
    public static void main(String[] args) {
        int a=72;
        int ans=0;
        int i=0;
        ans=a;
        while(ans%5!=0)
        {
            ans+=i;
            i++;
        }
        System.out.println(ans);
    }
}
