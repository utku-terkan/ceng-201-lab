/**
 * SinglyLinkedList.java
 * Represents a singly linked list.
 * Name:        UTKU TERKAN
 * Student ID:  240446030
 * Date:        11/10/2026
 */
package exercise1;
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
        // Start from the first node
        Node current = head;
        // Move to the last node
        while (current.next != null) {
            current = current.next;
        }
        // Connect the last node to the new node
        current.next = newNode;
    }
    // Prints all nodes in the list
    public void display() {
        // Start from the head
        Node current = head;
        // Visit each node and print its data
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        // Mark the end of the list
        System.out.println("NULL");
    }
    // Finds the middle node of the list
    public Node findMiddle() {
        // Return null if the list is empty
        if (head == null) {
            return null;
        }
        // Count the number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // Calculate the middle index
        int middleIndex = count / 2;
        // Go back to the first node
        current = head;
        // Move to the middle index
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        // Return the middle node
        return current;
    }

    // Returns the first node
    public Node getHead() {
        return head;
    }
}
