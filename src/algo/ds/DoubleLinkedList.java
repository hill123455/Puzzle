package ds;

public class DoubleLinkedList {

    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    //add a node to the list
    public void addNode(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void removeNode(int item) {
        Node pointer = head;
        while (pointer.item != item) {
            pointer = pointer.next;
        }

        if (pointer != null) {
            pointer.previous.next = pointer.next;
            pointer.next.previous = pointer.previous;
        }
    }
}
