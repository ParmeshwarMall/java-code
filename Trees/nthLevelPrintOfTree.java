package Trees;

public class



nthLevelPrintOfTree {
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

    static void print(Node root,int n)
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
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        a.left=c;
        a.right=d;
        b.left=e;
        Node f=new Node(7);
        d.right=f;
        //print(root,3);   // Used for particular level
        int n=height(root);
        for(int i=1;i<=n+1;i++)
        {
            print(root,i);
            System.out.println();
        }
    }
}
