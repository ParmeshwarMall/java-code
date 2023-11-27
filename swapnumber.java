public class swapnumber
{
    static  void swap(int a,int b)
    {
        System.out.println("Before swap");
        System.out.println("A= "+a);
        System.out.println("B= "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swap");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }

    static  void swapWithoutTemp(int a,int b)
    {
        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        //swap(a,b);
        swapWithoutTemp(a,b);
    }
}
