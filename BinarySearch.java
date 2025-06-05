package javaprograms;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] names = {"amit", "divya", "karan", "priya", "zoya"};
        Arrays.sort(names); // Binary search requires sorted array
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to search:");
        String key = sc.nextLine();
        
        int index = Arrays.binarySearch(names, key);
        
        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the list.");
        }
        
        sc.close();
    }
}