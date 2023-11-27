public class ReverseEachWordOfSentence {
    public static void main(String[] args) {
        String s="I am a student";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                sb.append(c);
            }
            else
            {
                sb.reverse();
                ans+=sb;
                ans+=(' ');
                sb=new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
