package javaprograms;
import java.util.Arrays;

public class StringarrayOperations {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "mango"};
        int[] numbers = {1, 2, 3, 4, 5};

        // Sort Strings
        Arrays.sort(words);
        System.out.println("Alphabetically Sorted: " + Arrays.toString(words));

        // Bubble Sort 
        bubbleSort(words);
        System.out.println("Bubble Sorted: " + Arrays.toString(words));

        // Reverse Words
        String sentence = "Hello Java World";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);

        // Reverse
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Reverse Words Function
    private static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    // Reverse Array Function
    private static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}