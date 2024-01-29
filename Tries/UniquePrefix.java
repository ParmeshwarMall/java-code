package Tries;

public class UniquePrefix {
    static class Node{
        Node []children=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            freq=1;
        }
    }
    static Node root=new Node();

    static void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            else
            {
                curr.freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    static String uniquePre(String str)
    {
        Node curr=root;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            if(curr.freq>1)
            {
                sb.append(curr.children[idx]);
            }
            else if(curr.freq==1)
            {
                //sb.append(curr.children[idx]);
                return sb.toString();
            }
            curr=curr.children[idx];
        }
        return null;
    }
    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i< arr.length;i++)
        {
            insert(arr[i]);
        }
        //String []ans=new String[4];
        System.out.println(uniquePre("duck"));
    }
}
