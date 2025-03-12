class Item {
    // Static variable to count the number of objects created
    static int objectCount = 0;
    
    // Instance variable to store item name
    String itemName;
    
    // Constructor to initialize the item name and increment the object count
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;  // Increment the object count each time an object is created
    }
    
    // Method to display the name of the item
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
    
    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Create item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Display item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
        
        // Display the total object count
        Item.displayObjectCount();
    }
}
