package Trees;

public class SizeSumHeightMaxValue {
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

    static int size(Node root)
    {
        if(root==null)
            return 0;
        return 1+size(root.left)+size(root.right);
    }

    static int sum(Node root)
    {
        if(root==null)
            return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    static int prod(Node root)
    {
        if(root==null)
            return 1;
        return root.val*prod(root.left)*prod(root.right);
    }
    static int maxVal(Node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        int m=Math.max(maxVal(root.left),maxVal(root.right));
        return Math.max(root.val,m);
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
        System.out.println("Size = "+size(root));
        System.out.println("Sum = "+sum(root));
        System.out.println("Max Value = "+maxVal(root));
        System.out.println("Height = "+height(root));
        System.out.println("Product = "+prod(root));
    }
}
