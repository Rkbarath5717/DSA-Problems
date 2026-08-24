import java.util.*;
public class AvlTree {

    static class Node{
        int data;
        int height;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.height=1;
            this.left=null;
            this.right=null;
        }
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }

    static int getBalance(Node root){
        if(root == null){
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    static Node rightRotate(Node y){
        Node x = y.left;
        Node temp = x.right;
        x.right = y;
        y.left = temp;

        y.height = 1 + Math.max(height(y.left),height(y.right));
        x.height = 1 + Math.max(height(x.left),height(x.right));

        return x;
    }

    static Node leftRotate(Node x){
        Node y = x.right;
        Node temp = y.left;
        y.left = x;
        x.right=temp;

        x.height = 1 + Math.max(height(x.left),height(x.right));
        y.height = 1 + Math.max(height(y.left),height(y.right));

        return y;
    }

    static Node insert(Node root,int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.data){
            root.left = insert(root.left,value);
        }
        if(value > root.data){
            root.right = insert(root.right,value);
        }
        else{
            return root;
        }

        root.height = 1 + Math.max(height(root.left),height(root.right));

        int balance = getBalance(root);

    if(balance > 1 && value < root.left.data){
        return rightRotate(root);
    }
    if(balance < 1 && value < root.right.data){
        return leftRotate(root);
    }
    if(balance > 1 && value > root.left.data){
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }
    if(balance < 1 && value < root.right.data){
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }
    return root;

    }

    static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        preOrder(root);
    }
}