import java.util.*;
public class TreeUsingDFS {
   static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}

    static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node current = q.poll();

            System.out.println(current.data + " ");

            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
        }
    }

public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.print("level Order : ");

        LevelOrder(root);
    }
}