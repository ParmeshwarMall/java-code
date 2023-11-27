package PatternQuestion;

public class Pattern16 {
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n/2)+1;j++)
            {
                if(i==1 || i==(n/2)+1)
                    System.out.print("* ");
                if(i==2 && j==2 || i>(n/2)+1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
