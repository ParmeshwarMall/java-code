package PatternQuestion;

public class Pattern5 {
    static void pattern(int n)
    {
        for(int i=1;i<(2*n);i++)
        {
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int j=1;j<=(2*n-i);j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
//        for(int i=1;i<=2*n;i++)
//        {
//            int colNo= i<=n ? i : 2*n-i;
//            for(int j=1;j<=colNo;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public static void main(String[] args) {
        pattern( 5);
    }
}
