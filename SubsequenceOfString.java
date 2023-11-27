import java.util.ArrayList;
public class SubsequenceOfString {
    static ArrayList<String> subSeq(String s)
    {
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0)
        {
            ans.add("");
            return ans;
        }
         char curr=s.charAt(0);
        ArrayList<String> smallAns=subSeq(s.substring(1));

        for(String ss:smallAns)
        {
            ans.add(ss);
            ans.add(curr+ss);
        }

        return ans;


    }

    public static void main(String[] args) {
        String s="abc";

        System.out.println(subSeq(s));
    }
}
