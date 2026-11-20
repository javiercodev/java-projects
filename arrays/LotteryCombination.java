import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LotteryCombination {

    private static final int NUMBERS_COUNT = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 49;
    
    public static void main(String[] args) {
        Random r = new Random();
        try (Scanner s = new Scanner(System.in)) {
            int[] winningCombination = new int[NUMBERS_COUNT];
            int[] bet = new int[NUMBERS_COUNT];
            // Generate the winning combination.
            fillRandom(winningCombination, r, MIN_NUMBER, MAX_NUMBER);
            //Read the user's bet.
            readBet(s, bet);
            // Display both combinations.
            System.out.println("Winning combination: " + Arrays.toString(winningCombination));
            System.out.println("Your combination: " + Arrays.toString(bet));
            // Calculate the number of matches.
            int matches = countMatches(winningCombination, bet);
            System.out.println( matches != 6 
                    ? "Sorry, you have matched: "    + matches
                    : "You win!, you have matched: " + matches);
        }
    }

    // Fills the array with random values between min and max (both included).
    private static void fillRandom(int[] values, Random r, int min, int max) {
       for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(max - min + 1) + min;
       }
    }

    // Read the six numbers entered by the user.
    private static void readBet(Scanner s, int[] bet) {
        for (int i = 0; i < bet.length; i++) {
            bet[i] = readInt(s, "Enter number " + (i + 1) + " (1-49): ", MIN_NUMBER, MAX_NUMBER);
        }
    }

    // Asks for an integer within the specified range, repeating until the input is valid.
    private static int readInt(Scanner s, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int number = Integer.parseInt(s.nextLine().trim());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("number must be between " + min + " and " + max + "!");
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Check whether a number exists in the array.
    private static boolean contains(int[] values, int number) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == number) {
                return true;
            }
        }
        return false;
    }

    // Count how many numbers from the bet appear in the winning combination.
    private static int countMatches(int[] winning, int[] bet) {
        int matches = 0;
        for (int i = 0; i < bet.length; i++) {
            if (contains(winning, bet[i])) {
                matches++;
            }
        }
        return matches;
    }
}
