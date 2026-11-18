import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    private static final int NUM_STUDENTS = 10;
    private static final int MIN_GRADE = 0;
    private static final int MAX_GRADE = 10;
    private static final int PASS_GRADE = 5;
    private static final int BONUS_POINTS = 1;

    public static void main(String[] args) {
        int[] grades = new int[NUM_STUDENTS];
        fillRandom(grades, new Random(), MIN_GRADE, MAX_GRADE);

        System.out.println("Grades:   " + format(grades));
        System.out.printf("Average:  %.2f%n", average(grades));
        System.out.println("Max:      " + max(grades));
        System.out.println("Min:      " + min(grades));
        System.out.println("Passed:   " + countPassed(grades));

        // The original array must stay unchanged after raising the grades.
        int[] boosted = raiseGrades(grades, BONUS_POINTS);
        System.out.println("Boosted:  " + format(boosted));
        System.out.println("Original: " + format(grades));

        try (Scanner s = new Scanner(System.in)) {
            int target = readIntInRange(s, "Grade to search (" + MIN_GRADE + "-" + MAX_GRADE + "): ", MIN_GRADE, MAX_GRADE);
            int position = indexOf(grades, target);
            System.out.println(position == -1
                    ? "Grade " + target + " not found."
                    : "Grade " + target + " found at position " + position + ".");

            rotateRight(grades);
            System.out.println("Rotated:  " + format(grades));
            System.out.println("Repeated: " + hasRepeated(grades));
        }
    }

    // Fills the array with random values between min and max (both included).
    private static void fillRandom(int[] values, Random r, int min, int max) {
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(max - min + 1) + min;
        }
    }

    // Returns the average (cast before dividing to avoid integer division).
    private static double average(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;   
        }
        return (double) sum / values.length;
    }

    // Returns the largest element (starts at the first one, so negatives work).
    private static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) { max = values[i]; }
        }
        return max;
    }

    // Returns the smallest element.
    private static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) { min = values[i]; }
        }
        return min;
    }

    // Returns how many grades are a pass or better.
    private static int countPassed(int[] values) {
        int passed = 0;
        for (int value : values) {
            if (value >= PASS_GRADE) { passed++; }
        }
        return passed;
    }

    // Returns a new array with every grade raised, capped at MAX_GRADE.
    private static int[] raiseGrades(int[] values, int points) {
        int[] raised = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            raised[i] = Math.min(values[i] + points, MAX_GRADE);
        }
        return raised;
    }

    // Returns the first position of target, or -1 if it is absent.
    private static int indexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) { return i; }
        }
        // After the loop, only now we know it was not found.
        return -1;
    }

    // Moves every element one position right; the last one goes to the front.
    private static void rotateRight(int[] values) {
        int last = values[values.length - 1];
        // Right to left, otherwise the same value would be copied everywhere.
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = last;
    }

    // True if any value appears more than once.
    private static boolean hasRepeated(int[] values) {
        for (int i = 0; i < values.length; i++) {
            // j starts at i + 1 so an element is never compared with itself.
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) { return true; }
            }
        }
        return false;
    }

    // Builds "[ 4 - 9 - 2 ]" as a String instead of printing it.
    private static String format(int[] values) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < values.length; i++) {
            if (i > 0) { sb.append(" - "); }
            sb.append(values[i]);
        }
        return sb.append(" ]").toString();
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

    // Asks for an integer within [min,max], repeating until valid.
    private static int readIntInRange(Scanner s, String prompt, int min, int max) {
        while (true) {
            int value = readInt(s, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("num out of range!");
        }
    }
}