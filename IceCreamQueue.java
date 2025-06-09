import java.util.LinkedList;
import java.util.Queue;

public class IceCreamQueue {
    public static void main(String[] args) {
        // Create a queue to represent kids waiting for ice cream
        Queue<String> iceCreamQueue = new LinkedList<>();
        
        // Add 5 kids to the queue
        iceCreamQueue.add("Alice");
        iceCreamQueue.add("Bob");
        iceCreamQueue.add("Charlie");
        iceCreamQueue.add("David");
        iceCreamQueue.add("Eve");

        // Show which kid is first
        System.out.println("First kid in the queue: " + iceCreamQueue.peek());

        // Serve the first kid (remove them from the queue)
        System.out.println("Serving: " + iceCreamQueue.poll());

        // Add a new kid at the end of the queue
        iceCreamQueue.add("Frank");
        System.out.println("New kid added to the queue: Frank");

        // Print the updated queue
        System.out.println("\nUpdated Ice Cream Queue:");
        for (String kid : iceCreamQueue) {
            System.out.println(kid);
        }
    }
}