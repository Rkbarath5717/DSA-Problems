import java.util.*;
public class TreeUsingOperations{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }

    static Node createTree(){
        Node root = new Node(70);
        root.left= new Node(40);
        root.right=new Node(80);
        root.left.left = new Node(30);
        root.left.right = new Node(50);
        root.right.left= new Node(60);
        root.right.right=new Node(65);

        return root;
    }
    
    static int count(Node root){
        if(root==null){
            return 0;
        }
        
        return 1+count(root.left)+count(root.right);
    }

    static int height(Node root){
        if(root==null){
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight= height(root.right);

        return 1+ Math.max(leftHeight,rightHeight);
    }

    static int sum(Node root){
        if(root == null ){
            return 0;
        }

        return root.data + sum(root.left)+sum(root.right);
    }

    static boolean search(Node root,int value){
        if(root == null){
            return false;
        }
        if(root.data == value){
            return true;
        }
        if(value < root.data){
            return search(root.left,value);
        }
        return search(root.right,value);
    }

    static Node maximum(Node root){
        if(root == null){
            return null;
        }
        while(root.right != null){
            root = root.right;
        }

        return root;
    }


    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Totals Nodes : " + count(root));
        System.out.println("Height of the Tree : " + height(root));
        System.out.println("Total sum of the Tree : " + sum(root));
        System.out.println("The node is not found : " + search(root,50));
        System.out.println("The maximum value of the node : " + maximum(root).data);
    }
}