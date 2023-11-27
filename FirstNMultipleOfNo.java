/*public class FirstNMultipleOfNo {
    static int multiple(int p,int q)
    {
        if(q==1)
            return p;

        int n=multiple(p,q-1);
        return p*q;
    }

    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            System.out.println(multiple(5, i));
        }
    }
}*/


public class FirstNMultipleOfNo{
    static void multiple(int p,int q)
    {
        if(q==1)
        {
            System.out.println(p);
            return;
        }

        multiple(p,q-1);
        System.out.println(p*q);
    }

    public static void main(String[] args) {
        multiple(2,5);
    }
}
