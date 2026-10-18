/**
 * Node.java
 * Represents one node in a singly linked list.
 * Name:        UTKU TERKAN
 * Student ID:  240446030
 * Date:        11/10/2026
 */
package exercise1;
public class Node {
    // Stores the node's data
    int data;
    // Points to the next node
    Node next;
    // Creates a new node
    public Node(int data) {
        this.data = data; // Set the data value
        this.next = null; // No next node yet
    }
}
