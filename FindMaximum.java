import java.util.*;

public class FindMaximum {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node insert(Node root,int data){
            if(root == null){
                return new Node(data);
            }
            if(data < root.data){
                root.left = insert(root.left,data);
            }
            else{
                root.right = insert(root.right,data);
            }
            return root;
    }

    static int findMaximum(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftMove = findMaximum(root.left);
        int rightMove = findMaximum(root.right);

        return Math.max(root.data,Math.max(leftMove,rightMove));
    }

    static int findMinimum(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftM=findMinimum(root.left);
        int rightM=findMinimum(root.right);

        return Math.min(root.data,Math.min(leftM,rightM));
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Node root = null;

        for(int i=0;i<n;i++){
            int data = scn.nextInt();
            root = insert(root,data);
        }
        System.out.println(findMaximum(root));
        System.out.println(findMinimum(root));
    }
}