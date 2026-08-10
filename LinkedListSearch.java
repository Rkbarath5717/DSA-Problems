class List{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newNode;
    }

    boolean found(int value){
        if(head==null){
            System.out.println("Node is empty");
        }
        Node temp = head;

        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}


public class LinkedListSearch {
    public static void main(String[] args) {
        List l = new List();
        // l.add(10);
        // l.add(20);
        // l.add(30);
        int value = 20;

        System.out.println(l.found(value));
    }
}