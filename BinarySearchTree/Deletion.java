package BinarySearchTree;
import java.util.*;
public class Deletion {
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
        Node temp=new Node(Integer.MAX_VALUE);
        temp.left=root;
        deletion(temp,7);
        preorder(root);
    }

    private static void deletion(Node root, int tar) {
        if(root==null)
            return;
        else if(root.val>tar)
        {
            if(root.left.val==tar)
            {
                Node l=root.left;     // l is a node which we have to delete
                if(l.left==null && l.right==null)  // leaf node
                {
                    root.left=null;
                }
                else if(l.left==null || l.right==null)    // 1 child
                {
                    if(l.left!=null) root.left=l.left;
                    else root.left=l.right;
                }
                else
                {
                    Node curr=l;
                    Node pred=l.left;
                    while(pred.right!=null) pred=pred.right;
                    deletion(root,pred.val);
                    curr.left=pred.left;
                    curr.right=pred.right;
                    root.left=pred;
                }
            }
            else deletion(root.left,tar);
        }
        else
        {
            if(root.right.val==tar)
            {
                Node r=root.right;   // r is the node which we have to delete
                if(r.left==null && r.right==null)
                    root.right=null;
                else if(r.left==null || r.right==null)
                {
                    if(r.left!=null) root.right=r.left;
                    else root.right=r.right;
                }
                else
                {
                    Node curr=r;
                    Node pred=r.left;
                    while(pred.right!=null) pred=pred.right;
                    deletion(root,pred.val);
                    curr.left=pred.left;
                    curr.right=pred.right;
                    root.left=pred;
                }
            }
            else deletion(root.right,tar);
        }
    }

    static void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

}
