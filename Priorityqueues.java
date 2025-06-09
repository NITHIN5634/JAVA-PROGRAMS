package javaprograms;
import java.util.PriorityQueue;
import java.util.Collections;

public class Priorityqueue {
    public static void main(String[] args) {
        // Min Heap (default behavior of PriorityQueue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(10);

        System.out.println("Min Heap (Ascending Order):");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        // Max Heap (using a comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(10);

        System.out.println("\nMax Heap (Descending Order):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}