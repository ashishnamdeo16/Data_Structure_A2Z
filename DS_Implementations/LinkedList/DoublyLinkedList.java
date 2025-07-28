public class DoublyLinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        Node current = head;

        //Forward Printing
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        //Pointer
        Node curr = third;

        //Backward Printing
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
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