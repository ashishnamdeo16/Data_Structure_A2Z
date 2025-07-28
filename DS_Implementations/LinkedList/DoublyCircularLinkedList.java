public class DoublyCircularLinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = head;
        third.prev = second;
        second.prev = head;

        //Pointer
        Node curr = head;

        //Forward Printing
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }while(curr != head);
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}