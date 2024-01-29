package Trees;

import java.util.*;

public class TraversingOnTree {
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

    static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        if(root!=null)
            q.add(root);
        while(q.size()>0)
        {
            Node temp=q.peek();
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);

            System.out.print(temp.val+" ");
            q.remove();
        }
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
        System.out.print("Preorder Traversal is : ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder Traversal is : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder Traversal is : ");
        postorder(root);
        System.out.println();
        System.out.print("BFS traversal is : ");
        bfs(root);
    }
}
