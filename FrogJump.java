public class FrogJump {
    static int bestCost(int h[],int n,int idx)
    {
        if(idx==n-1)
        {
            return 0;
        }

        int opt1=Math.abs(h[idx]-h[idx+1])+bestCost(h,n,idx+1);
        if(idx==n-2)
            return opt1;

        int opt2=Math.abs(h[idx]-h[idx+2])+bestCost(h,n,idx+2);

        return Math.min(opt1,opt2);
    }

    public static void main(String[] args) {
        int h[]={10,30,40,20};
        System.out.println(bestCost(h,4,0));
    }
}
