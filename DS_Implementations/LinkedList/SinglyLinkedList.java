public class SinglyLinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        //Declaring Pointer
        Node current = head;

        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

class Node{
    int val;
    Node next;

    public Node(int data){
        this.val = data;
        this.next = null;
    }
}