package exercise2;
/**
 * DeleteMiddleDemo.java
 * Tests deleting the middle node of a singly linked list.
 * Name:        UTKU TERKAN
 * Student ID:  240446030
 * Date:        11/10/2026
 */
public class DeleteMiddleDemo {

    public static void main(String[] args) {
        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();
        // Test 1: Odd number of nodes
        SinglyLinkedList list1 = new SinglyLinkedList();
        // Add nodes to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("Original List 1:");
        list1.display();
        // Delete the middle node
        list1.deleteMiddle();
        System.out.println("After deleting middle:");
        list1.display();
        System.out.println();
        // Test 2: Even number of nodes
        SinglyLinkedList list2 = new SinglyLinkedList();
        // Add nodes to the list
        list2.add(11);
        list2.add(25);
        list2.add(36);
        list2.add(49);
        list2.add(53);
        list2.add(95);

        System.out.println("Original List 2:");
        list2.display();
        // Delete the second middle node
        list2.deleteMiddle();
        System.out.println("After deleting middle:");
        list2.display();
        System.out.println();
        // Test 3: One node
        SinglyLinkedList list3 = new SinglyLinkedList();

        // Add one node to the list
        list3.add(999);
        System.out.println("Original List 3:");
        list3.display();
        // Delete the only node
        list3.deleteMiddle();
        System.out.println("After deleting middle:");
        list3.display();
    }
}

