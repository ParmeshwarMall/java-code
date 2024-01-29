package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromArray {
    public static class Node
    {
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val=val;
        }
    }
    static void print(Node root, int n)
    {
        if(root==null)
            return;
        if(n==1)
        {
            System.out.print(root.val+" ");
        }
        print(root.left,n-1);
        print(root.right,n-1);
    }

    static int height(Node root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
        {
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    static Node constTree(String[] arr)
    {
        int n= arr.length;
        int x=Integer.parseInt(arr[0]);
        Node root=new Node(x);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1)
        {
            Node temp=q.remove();
            Node left=new Node(10);    // Firstly put any value
            Node right=new Node(110);
            if(arr[i].equals(""))
            {
                left=null;
            }
            else
            {
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if(arr[i+1].equals(""))
            {
                right=null;
            }
            else
            {
                int r=Integer.parseInt(arr[i+1]);
                right.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }

    public static void main(String[] args) {
        //String []arr={"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        String []arr={"2","1","","","2","1","","","2"};
        Node root=constTree(arr);
        int level=height(root);
        for(int i=1;i<=level+1;i++)
        {
            print(root,i);
            System.out.println();
        }
    }
}
