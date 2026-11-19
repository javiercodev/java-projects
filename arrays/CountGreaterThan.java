import java.util.Arrays;
import java.util.Scanner;

public class CountGreaterThan {

    public static void main(String[] args) {
        int[] values = {7, 3, 9, 4, 6};
        System.out.println(Arrays.toString(values));
        try (Scanner s = new Scanner(System.in)) {
            int n = readInt(s, "Enter a number: ");
            System.out.println("Total: " + countGreater(values, n));
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

    // Count the numbers greater than the target.
    private static int countGreater(int[] values, int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > target) { count++; }
        }
        return count;
    }
}