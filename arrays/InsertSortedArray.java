import java.util.Scanner;
import java.util.Arrays;

public class InsertSortedArray {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 17};
        try (Scanner s = new Scanner(System.in)) {
            int num = readInt(s, "Enter a number to insert: ");
            int[] result = insertSortedOptimized(numbers, num);
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
                System.out.println("invalid num!");
            }
        }
    }

    // Creates a new array, inserts the value, and sorts it using Bubble Sort.
    private static int[] insertSorted(int[] values, int insert) {
        int[] result = new int[values.length + 1];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i];
        }
        result[result.length - 1] = insert;
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int aux = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = aux;
                }
            }
        }
        return result;
    }

    // Inserts a value into an already sorted array without sorting it again.
    private static int[] insertSortedOptimized(int[] values, int insert) {
        int[] result = new int[values.length + 1];
        int i = 0, j = 0;
        boolean inserted = false;
        while (i < values.length) {
            if (!inserted) {
                if (values[i] <= insert) {
                    result[j] = values[i];
                    i++;
                    j++;
                } else {
                    result[j] = insert;
                    j++;
                    inserted = true;
                }
            } else {
                result[j] = values[i];
                i++;
                j++;
            }
            if (!inserted) { result[j] = insert; }
        }
        return result;
    }
}