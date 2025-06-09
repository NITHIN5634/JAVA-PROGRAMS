import java.util.ArrayList;
import java.util.Collections;

public class CartoonCharactersList {
    public static void main(String[] args) {
        // Create an ArrayList of cartoon characters
        ArrayList<String> cartoonCharacters = new ArrayList<>();
        Collections.addAll(cartoonCharacters, "Mickey Mouse", "Bugs Bunny", "SpongeBob SquarePants", "Scooby-Doo", "Tom");

        // Remove one character ("Tom")
        cartoonCharacters.remove("Tom");

        // Replace one character ("Scooby-Doo" with "Donald Duck")
        int index = cartoonCharacters.indexOf("Scooby-Doo");
        if (index != -1) {
            cartoonCharacters.set(index, "Donald Duck");
        }

        // Print all names using a loop
        System.out.println("Cartoon Characters List:");
        for (String character : cartoonCharacters) {
            System.out.println(character);
        }

        // Bonus: Sort the list alphabetically and print again
        Collections.sort(cartoonCharacters);
        System.out.println("\nSorted Cartoon Characters List:");
        for (String character : cartoonCharacters) {
            System.out.println(character);
        }
    }
}