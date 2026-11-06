import java.util.Scanner;

public class DrawHourglassPattern {
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                int size = readInt(s, "Enter the hourglass size (odd integer): ");
                // Valid sizes are positive and odd.
                boolean isOdd = (size > 0 && size % 2 != 0);
                if (isOdd) {
                    int stars = drawHourglass(size);
                    calculatePercetange(stars, size);
                    break;
                } else {
                    System.out.println("error: the size must be an odd integer!");
                }
            }
        }
    }

    // Asks for an integer, repeating until the input is valid.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException error) { // Throw an error if the input is not an integer.
                System.out.println("You must enter a valid number.");
            }
        }
    }

    // Draws the hourglass and returns how many asterisks it used.
    private static int drawHourglass(int size) {
        int count = 0; // Count the asterisks.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isStar(i, j, size)) {
                    System.out.print("*");
                    count++; // Counted once per position, so no duplicates.
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Asterisks used: " + count);

        return count;
    }

    // True for the first/last row and both diagonals.
    private static boolean isStar(int i, int j, int size) {
        return i == 0 || i == size - 1 || j == i || j == size - 1 - i;
    }

    // Prints the percentage of the n x n grid covered by asterisks.
    private static void calculatePercetange(int stars, int size) {
        int grid = size * size;
        // Cast before dividing to avoid integer division.
        double percentage = (stars / (double) grid) * 100;
        System.out.printf("Grid percentage %.2f", percentage);
    }
}