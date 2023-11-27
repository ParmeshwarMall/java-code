public class SubsetOfStringInBacktraking {
    static void subset(String s,String ans,int i)
    {
        if(i==s.length())
        {
            System.out.print(ans+" ");
            return;
        }

        subset(s,ans+s.charAt(i),i+1);   // for Yes
        subset(s,ans,i+1);   // for No
    }

    public static void main(String[] args) {
        String s="abc";
        subset(s,"",0);
    }
}
