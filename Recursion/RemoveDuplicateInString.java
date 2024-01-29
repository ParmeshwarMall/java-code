package Recursion;

public class RemoveDuplicateInString {
    static String remDup(String s,int i,boolean[]flag,StringBuilder sb)
    {
        if(i==s.length())
        {
            return sb.toString();
        }
        char curr=s.charAt(i);
        if(flag[curr-'a']==false)
        {
            sb.append(curr);
            flag[curr-'a']=true;
        }
        remDup(s,i+1,flag,sb);
        return sb.toString();
    }

//    static String remDup(String s,int i,boolean[]flag,StringBuilder sb)
//    {
//        if(i==s.length())
//        {
//            return sb.toString();
//        }
//        char curr=s.charAt(i);
//        if(flag[curr-'a']==true)
//        {
//            remDup(s,i+1,flag,sb);
//        }
//        else
//        {
//            flag[curr-'a']=true;
//            remDup(s,i+1,flag,sb.append(curr));
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {
        String s="appnnacollege";
        System.out.println(remDup(s,0,new boolean[26],new StringBuilder()));
    }
}
