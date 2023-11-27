package PatternQuestion;

public class Pattern14 {
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*n)-2*i+1;k++)
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    if(k==1 || k==(2*n)-2*i+1)
                    {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
