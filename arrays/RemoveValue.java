import java.util.Scanner;
import java.util.Arrays;

public class RemoveValue {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 7, 9, 7, 3, 5};
        try (Scanner s = new Scanner(System.in)) {
            int target = readInt(s, "Enter a number to remove: ");
            int[] result = removedValue(numbers, target);
            System.out.println("Original: " + Arrays.toString(numbers));
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    // Asks for an integer, repeating until the input is valid.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid input!");
            }
        }
    }

    // Returns a new array without any occurrence of target (the original is not modified).
    private static int[] removedValue(int[] values, int target) {
        // First pass: count how many elements will be removed to size the new array.
        int removedCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) { removedCount++; }
        }
        // Second pass: copy every element that is not the target.
        int[] result = new int[values.length - removedCount];
        int next = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) { result[next] = values[i]; next++; }
        }
        return result;
    }
}