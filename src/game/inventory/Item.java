/**
 * Your Name:        Utku Terkan
 * Your Student ID:  240446030
 * Your Date:        10/11/2026
 */

package game.inventory;

// Represents a single game product
public class Item {

    // Product information can only be directly modified inside this class
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    // Creates a new game product
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Returns the product name
    public String getName() {
        return name;
    }

    // Returns the product genre
    public String getGenre() {
        return genre;
    }

    // Returns the current stock count
    public int getStockCount() {
        return stockCount;
    }

    // Allows the Inventory class in the same package to access the serial code
    String getSerialCode() {
        return serialCode;
    }

    // Checks whether enough stock is available for the sale
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    // Attempts to sell the specified quantity of products
    public void sell(int quantity) {

        // Prevents sales with zero or negative quantities
        if (quantity <= 0) {
            System.out.println("WARNING: Quantity must be positive.");
            return;
        }

        // Completes the sale if enough stock is available
        if (isAvailable(quantity)) {
            stockCount -= quantity;

            System.out.println("Sold " + quantity
                    + " copy/copies of " + name
                    + ". Remaining stock: " + stockCount);
        } else {
            // Prints a warning without changing the stock if there is not enough
            System.out.println("WARNING: Not enough stock for " + name
                    + ". Requested: " + quantity
                    + ", Available: " + stockCount);
        }
    }
}