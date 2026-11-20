import java.util.Scanner;

public class LastOcurrence {
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] values = {3, 8, 3, 1};
            int x = readInt(s, "Enter a number: ");
            int position = lastOccurrence(values, x);
            System.out.println(position == -1
                    ? "No matching values found in the array"
                    : "Its last position is: " + position + "."
            );
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

    // Display the last position of x.
    private static int lastOccurrence(int[] values, int x) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == x) {
                return i;
            }
        }
        return -1;
    }
}