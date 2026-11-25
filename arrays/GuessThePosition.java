import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessThePosition{

    private static final int ARRAY_SIZE = 10;
    private static final int MIN_POSITION = 0;
    private static final int MAX_POSITION = ARRAY_SIZE - 1;
    private static final int TARGET_VALUE = 1;

    public static void main(String[] args) {
        int[] values = new int[ARRAY_SIZE];
        Random r = new Random();
        placeTargetAtRandomPosition(values, r);
        // Display the array for testing purposes.
        System.out.println(Arrays.toString(values));
        try (Scanner s = new Scanner(System.in)) {
            int attemps = 0;
            while (true) {
                int guess = readIntInRange(s, "Guess the position: ", MIN_POSITION, MAX_POSITION);
                attemps++;
                boolean found = isTargetAtPosition(values, guess);
                if (found) { System.out.println("Correct!\nNumber of attemps: " + attemps); break; }
                System.out.println("Incorrect!");
            }
        }
    }

    // Places the target value at one random position in the array.
    private static void placeTargetAtRandomPosition(int[] values, Random r) {
        int randomPosition = r.nextInt(values.length);
        values[randomPosition] = TARGET_VALUE;
    }

    // Asks for an integer within [min, max], repeating until valid.
    private static int readIntInRange(Scanner s, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(s.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("please enter a number between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Checks whether the target value is located at the specified position.
    private static boolean 	isTargetAtPosition(int[] values, int position) {
        return values[position] == TARGET_VALUE;
    }
}