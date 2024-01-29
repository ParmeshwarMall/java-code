package Recursion;

public class BinaryString {
    static void binaryString(int n,int lastPlace,String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        binaryString(n-1,0,s+'0');
        if(lastPlace==0)
        {
            binaryString(n-1,1,s+'1');
        }
    }

    public static void main(String[] args) {
        binaryString(3,0,"");
    }
}
