package PatternQuestion;

public class Pattern12 {
    static void pattern(int n)
    {
        for(int i=1;i<=2*n;i++)
        {
            int space= i<=n ? i-1 :2*n-i;
            int star= i<=n ? n-i+1 : i-n;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
