import java.util.*;

public class TreeLevel {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static Node createTree(Scanner scn){
        int value = scn.nextInt();
        if(value==-1){
            return null;
        }
        Node root = new Node(value);
        root.left = createTree(scn);
        root.right = createTree(scn);

        return root;
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data  +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value :  ");
        Node root = createTree(scn);
        preOrder(root);
    }
}