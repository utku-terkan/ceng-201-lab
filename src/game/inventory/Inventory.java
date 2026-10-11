
package game.inventory;

// Manages a collection of game products
public class Inventory {

    // An array that can hold up to 10 products
    private Item[] items;

    // Keeps track of the number of added products
    private int count;

    // Initializes the array when an inventory is created
    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // Adds a new product to the inventory
    public void addItem(Item item) {

        // Adds the product if there is available space
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Inventory is full!");
        }
    }

    // Displays all added products
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");

        // Loops through only the products that have been added
        for (int i = 0; i < count; i++) {

            // Uses public getter methods to access product information
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    items[i].getName(),
                    items[i].getGenre(),
                    items[i].getStockCount());
        }
    }

    // Displays serial codes for inventory auditing
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");

        // Prints the name and serial code of each added product
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s -> %s%n",
                    items[i].getName(),
                    items[i].getSerialCode());
        }
    }
}