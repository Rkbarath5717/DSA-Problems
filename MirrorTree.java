import java.util.*;
public class MirrorTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }

    static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        mirror(root.left);
        mirror(root.right);

        return root;
    }

    static void preOrder(Node root){
        if(root==null){
            return ;
        }
        preOrder(root.left);
        System.out.println(root.data + " ");
        preOrder(root.right);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Node root = null;
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            int data = scn.nextInt();
            root=insert(root,data);
        }

        preOrder(root);
        mirror(root);
        preOrder(root);
    }
}