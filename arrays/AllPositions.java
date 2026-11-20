import java.util.Arrays;
import java.util.Scanner;

public class AllPositions{

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] values = {3, 8, 3, 1, 3};
            int x = readInt(s, "Enter a number: ");
            int[] result = allOcurrences(values, x);
            System.out.println(Arrays.toString(result));
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

    // Count how many time x appears in the array.
    private static int countOccurrences(int[] values, int x) {
        int occurrences = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == x) { occurrences++; }
        }
        return occurrences;
    }

    // Return array containing all positions where x appears.
    private static int[] allOcurrences(int[] values, int x) {
        int occurrences = countOccurrences(values, x);
        int[] positions = new int[occurrences];
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == x) { positions[j] = i; j++; }
        }
        return positions;
    }
}