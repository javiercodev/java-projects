import java.util.Scanner;

public class SortThreeNumbersWithoutLoops {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = readInt(s, "Enter a number: ");
            int b = readInt(s, "Enter a number: ");
            int c = readInt(s, "Enter a number: ");
            orderMinMax(a, b, c);
        }
    }

    private static int readInt(Scanner s, String prompt) {
        // Repeat until the user enters a valid number.
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                // Display an error if the input is not a valid integer.
                System.out.println("invalid num!");
            }
        }
    }

    private static void orderMinMax (int a, int b, int c) {
        int temp = 0;
        // Sorts three numbers whith swaps and prints them in ascending order.
        if (a > b) { temp = a; a = b; b = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (a > b) { temp = a; a = b; b = temp; }
        System.out.print(a + " " + b + " " + c);
    }
}