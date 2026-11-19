import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchArray {

    public static void main(String[] args) {
        int[] n = new int[10];
        fillRandom(n, new Random(), 1, 10);
        System.out.println(Arrays.toString(n));
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                int numToSearch = readInt(s, "Enter a number(0 to exit): ");
                if (numToSearch == 0) { break; }
                int position = indexOf(n, numToSearch);
                System.out.println(position == -1
                        ? "Number " + numToSearch + " not found."
                        : "Number " + numToSearch + " found at position " + position + "."
                );
            }
        }
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

    // Returns the first position of target, or -1 if it is absent.
    private static int indexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) { return i; }
        }
        return -1;
    }
}