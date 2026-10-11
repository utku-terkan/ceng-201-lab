/**
 * Your Name:        Utku Terkan
 * Your Student ID:  240446030
 * Your Date:        10/11/2026
 */
import game.inventory.Item;
import game.inventory.Inventory;

// Runs the main program for the game shop
public class GameShop {

    public static void main(String[] args) {

        // Creates a new inventory
        Inventory shop = new Inventory();

        // Creates three different game products
        Item game1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item game2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item game3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        // Adds the products to the inventory
        shop.addItem(game1);
        shop.addItem(game2);
        shop.addItem(game3);

        // Displays the initial stock information
        shop.displayAll();

        System.out.println();

        // Attempts to sell 4 copies of Galaxy Racer
        game1.sell(4);

        // Attempts to sell 6 copies of Shadow Realm
        // Displays a warning because only 5 copies are available
        game2.sell(6);

        System.out.println();

        // Displays the updated stock information
        shop.displayAll();

        System.out.println();

        // Audits and displays the serial codes of all products
        shop.auditSerialCodes();

        // Uncommenting the following line will cause a compilation error:
        // System.out.println(game1.getSerialCode());
        // GameShop is outside the game.inventory package
        // and cannot access a package-private method.
    }
}