import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysClassMethods {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillRandom(numbers, new Random(), 1, 50);
        // Print the original array contents:
        System.out.println(Arrays.toString(numbers));

        // Create a copy of an array:
        int[] copy = Arrays.copyOf(numbers, 10);

        // Sort the array:
        Arrays.sort(numbers);

        // Compare whether the two arrays are equal. They are not because we sorted the original array.
        System.out.println(Arrays.equals(numbers, copy));

        // Binary search:
        Scanner s = new Scanner(System.in);
        int target = readInt(s, "Enter a number: ");
        // A negative result means that the target number is not in the array.
        System.out.println(Arrays.binarySearch(numbers, target));

        // Copy elements from index 2 (inclusive) to index 5 (exclusive) into a new array.
        int[] range = Arrays.copyOfRange(copy, 2, 5);
        System.out.println(Arrays.toString(range));
        
        // Fills all elements of an array with the specified value.
        Arrays.fill(numbers, -1);
        System.out.println(Arrays.toString(numbers));

    }

    // Fills the array with random values between min and max (both included).
    private static void fillRandom(int[] values, Random r, int min, int max) {
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(max - min + 1) + min;
        }
    }

    // Asks for an integer, repeating until the input is valid.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }
}