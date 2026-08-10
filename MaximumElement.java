class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class List{
    Node head;

    void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp=temp.next;
        }

        temp.next = newNode;
    }

    int findMaximum(){
        if(head == null){
            return -1;
        }

        int max = head.data;

        Node temp = head.next;

        while(temp != null){
            if(temp.data > max){
                max=temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
}
public class MaximumElement {
    public static void main(String[] args) {
        List l = new List();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(20);
        l.add(20);

        System.out.println(l.findMaximum());
    }
}