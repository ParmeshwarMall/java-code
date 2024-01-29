package Trees;

import java.util.Stack;

public class DFSUsingIteration {
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
        Stack<Node> st=new Stack<>();
        Node temp=root;
        st.push(temp);
        while(st.size()!=0)
        {
            temp=st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null)
            {
                st.push(temp.right);
            }
            if(temp.left!=null)
            {
                st.push(temp.left);
            }
        }
    }
    static void Inorder(Node root)
    {
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()!=0)
        {
            Node temp=st.peek();
            if(temp.left!=null)
            {
                st.push(temp.left);
                temp.left=null;
            }
            else
            {
                st.pop();
                System.out.print(temp.val+" ");
                if(temp.right!=null)
                {
                    st.push(temp.right);
                }
            }

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
       //Inorder(root);
        System.out.println();
        preorder(root);
    }
}
