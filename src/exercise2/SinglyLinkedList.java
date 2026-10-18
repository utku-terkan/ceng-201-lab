package exercise2;
/**
 * SinglyLinkedList.java
 * Represents a singly linked list.
 * Name:        UTKU TERKAN
 * Student ID:  240446030
 * Date:        11/10/2026
 */
public class SinglyLinkedList {
    // Stores the first node
    private Node head;
    // Creates an empty list
    public SinglyLinkedList() {
        head = null;
    }
    // Adds a new node to the end of the list
    public void add(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // If the list is empty, set the new node as head
        if (head == null) {
            head = newNode;
            return;
        }
        // Find the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Connect the last node to the new node
        current.next = newNode;
    }
    // Prints all nodes in the list
    public void display() {
        Node current = head;
        // Visit each node
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    // Deletes the middle node
    public void deleteMiddle() {
        // Do nothing if the list is empty
        if (head == null) {
            return;
        }
        // Count the number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // If there is only one node, remove it
        if (count == 1) {
            head = null;
            return;
        }
        // Find the index of the middle node
        int middleIndex = count / 2;
        // Start from the first node
        current = head;
        // Find the node before the middle node
        for (int i = 0; i < middleIndex - 1; i++) {
            current = current.next;
        }
        // Skip the middle node
        current.next = current.next.next;
    }
    // Returns the first node
    public Node getHead() {
        return head;
    }
}

