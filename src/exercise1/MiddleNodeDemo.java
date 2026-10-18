package exercise1;
/**
 * MiddleNodeDemo.java
 * Tests the linked list and findMiddle() method.
 * Name:        UTKU TERKAN
 * Student ID:  240446030
 * Date:        11/10/2026
 */

public class MiddleNodeDemo {
    public static void main(String[] args) {
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();
        // Test 1: List with an odd number of nodes
        SinglyLinkedList list1 = new SinglyLinkedList();
        // Add nodes to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("List 1:");
        // Display the list
        list1.display();
        // Find and print the middle node
        Node middle1 = list1.findMiddle();
        System.out.println("Middle Node: " + middle1.data);
        System.out.println();
        // Test 2: List with an even number of nodes
        SinglyLinkedList list2 = new SinglyLinkedList();
        // Add nodes to the list
        list2.add(15);
        list2.add(58);
        list2.add(64);
        list2.add(78);
        list2.add(91);
        list2.add(99);
        System.out.println("List 2:");
        // Display the list
        list2.display();
        // Find and print the middle node
        Node middle2 = list2.findMiddle();
        System.out.println("Middle Node: " + middle2.data);
        System.out.println();
    }
}
