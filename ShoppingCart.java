import java.util.*;

public class ShoppingCart {
    // Define the structure of an item
    static class Item {
        int itemID;
        int itemPrice;
        String itemName;

        public Item(int itemID, String itemName, int itemPrice) {
            this.itemID = itemID;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }

     ArrayList<Item> items; // ArrayList to store items

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the itemID");
        int itemID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the itemName");
        String itemName = sc.nextLine();
        System.out.println("Enter the itemPrice");
        int itemPrice = sc.nextInt();

        Item newItem = new Item(itemID, itemName, itemPrice);
        items.add(newItem); // Add the new item to the ArrayList
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the shopping cart.");
        } else {
            System.out.println("Items in the shopping cart:");
            for (Item item : items) {
                System.out.println("itemID \titemName\titemPrice ");
                System.out.println(+item.itemID+"\t"+item.itemName+"  \t"+item.itemPrice);

            }
        }
    }

    public void deleteItems() {
        // Implement logic to delete items based on itemID or other criteria
        // For example, prompt the user for the itemID and remove the corresponding item from the ArrayList
    }

    public void updateItems() {
        // Implement logic to update items based on itemID or other criteria
        // For example, prompt the user for the itemID and modify the corresponding item in the ArrayList
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItems(); // Test: Adding an item
        cart.showItems(); // Test: Displaying items
    }
}
//make menu driven next