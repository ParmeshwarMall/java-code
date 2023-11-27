package PatternQuestion;

public class Pattern15 {
    static void pattern(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int space= i<=n ? n-i : i-n;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            if(i<=n)
            {
                for(int k=1;k<=2*i-1;k++)
                {
                    if(k==1 || k==2*i-1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            else
            {
                for(int k=1;k<=(n*3)+3-(2*i);k++)
                {
                    if(k==1 || k==(n*3)+3-(2*i))
                        System.out.print("*");
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
