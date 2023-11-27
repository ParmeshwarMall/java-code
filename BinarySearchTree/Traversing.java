package BinarySearchTree;
import java.util.*;

public class Traversing {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
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
        String[] arr = {"4","2","7","1","3","5",""};
        Node root = constTree(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        inorderR(root);     // Reverse inorder
    }
    static void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    static void inorderR(Node root)
    {
        if(root==null) return;
        inorderR(root.right);
        System.out.print(root.val+" ");
        inorderR(root.left);
    }
}
