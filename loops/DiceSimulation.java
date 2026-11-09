import java.util.Scanner;
import java.util.Random;

public class DiceSimulation {

    // Minimun and maximum number of rolls allowed.
    private static final int MIN_ROLLS = 1; 
    private static final int MAX_ROLLS = 1000; 
    // Number of sides on each die.
    private static final int DIE_SIDES = 6;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num = readRolls(s, "How many rolls would you like to make?: ");
            simulation(num);
        }
    }

    private static int readRolls(Scanner s, String prompt) {
        // Repeat until the user enters a valid number.
        while (true) {
            try {
                System.out.print(prompt);
                int num = Integer.parseInt(s.nextLine().trim());
                // Check if the number is whithin the allowed range.
                if (num >= MIN_ROLLS && num <= MAX_ROLLS) {
                    return num;
                } else {
                    System.out.println("number out of range!");
                }
            } catch (NumberFormatException e) {
                // Display an error if the input is not a valid integer.
                System.out.println("invalid number!");
            }
        }
    }

    private static void simulation(int num) {
        Random r = new Random();
        // Initialize the counters and accumulator.
        int doubles = 0;
        int sum = 0;
        int seven = 0;
        // Repeat the simulation as many times as requested.
        for (int i = 0; i < num; i++) {
            // Generate a random number between 1 and 6 for each die.
            int die1 = r.nextInt(DIE_SIDES) + 1;
            int die2 = r.nextInt(DIE_SIDES) + 1;
            // Add the sum of both dice to the total accumulator.
            sum += die1 + die2;
            // Check the coincidences.
            if (die1 == die2) {
                doubles++;
            }
            if (die1 + die2 == 7) {
                seven++;
            }
        }
        System.out.println("Doubles: " + doubles);
        System.out.println("Number of times 7 has been rolled: " + seven);
        System.out.printf("Average: %.2f%n", (sum / (double) num));
        System.out.printf("Percentage of doubles: %.2f%%%n", ((doubles / (double) num) * 100));
    }
}