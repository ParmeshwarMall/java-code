public class CheckEvenOrOddUsingBinaryValue {
    static void evenOrOdd(int n)     // Find last bit
    {
        int bitMask=1;
        if((n & bitMask)==0)
        {
            System.out.printf("%d is even number",n);
        }
        else
        {
            System.out.printf("%d is odd number",n);
        }
    }

    public static void main(String[] args) {
        int n=6;
        evenOrOdd(n);
    }
}
