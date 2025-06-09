import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        // Create a HashMap to store items and their prices
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apples", 40);
        items.put("Milk", 50);
        items.put("Bread", 30);
        items.put("Eggs", 60);
        items.put("Rice", 80);

        // Calculate and print total cost of all items
        int totalCost = 0;
        for (int price : items.values()) {
            totalCost += price;
        }
        System.out.println("Total cost of all items: " + totalCost);

        // Update the price of any item (updating "Milk" to 55)
        items.put("Milk", 55);
        System.out.println("Updated price of Milk: " + items.get("Milk"));

        // Remove an item (removing "Bread")
        items.remove("Bread");
        System.out.println("Bread removed from the list.");

        // Print final list of items and prices
        System.out.println("\nFinal Item List:");
        for (String item : items.keySet()) {
            System.out.println(item + " -> " + items.get(item));
        }
    }
}