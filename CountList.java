class List{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head;

    void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newNode;
    }

    int countNode(){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
public class CountList {
    public static void main(String[] args) {
        List l = new List();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(30);
        System.out.println(l.countNode());
    }
}