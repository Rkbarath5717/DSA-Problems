import java.util.*;
public class TreeCreationUsingFor {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static Node createNode(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = createNode(root.left,data);
        }
        else if(data > root.data){
            root.right = createNode(root.right,data);
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Node root = null;
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            int data = scn.nextInt();
            root = createNode(root,data);
        }
    }
}