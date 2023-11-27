public class OperationsOnBit {
    static int getBit(int n, int i)      // Here i is position of that bit which we find
    {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    static int setBit(int n, int i) {
        int bitMask = (1 << i);
        return n | bitMask;
    }

    static int clearBit(int n, int i) {
        int bitMask = (~(1 << i));
        return n & bitMask;
    }

    static int updateBit(int n, int i,int newbit)
    {
        if(newbit==0)
        {
            return clearBit(n,i);
        }
        else
        {
            return setBit(n,i);
        }
    }

    static int clearLastBit(int n,int i)
    {
        int bitMask=(~0)<<i;
        return n & bitMask;
    }

    static int clearRangeOfBit(int n,int i,int j)
    {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }

    static int countSetBit(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n & 1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(getBit(10,2));
//        System.out.println(setBit(10,2));
//        System.out.println(clearBit(10,1));
//        System.out.println(updateBit(10,2,1));
//        System.out.println(clearLastBit(15,2));
//        System.out.println(clearRangeOfBit(16,2,5));
        System.out.println(countSetBit(16));
    }
}
