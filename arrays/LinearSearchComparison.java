import java.util.Random;

public class LinearSearchComparison {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 1000000;
    private static final int TARGET = -1;

    public static void main(String[] args) {
        int[] sizes = {10, 1000, 100000};
        Random r = new Random();
        for (int size : sizes) {
            int[] values = new int[size];
            fillRandom(values, r , MIN_VALUE, MAX_VALUE);
            int comparisons = linearSearchComparison(values, TARGET);
            System.out.println(size + " -> " + comparisons);
        }
    }

    // Fills the array with random values between min and max (both included).
    private static void fillRandom(int[] values, Random r, int min, int max) {
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(max - min + 1) + min;
        }
    }

    private static int linearSearchComparison(int[] values, int target) {
        int comparisons = 0;
        for (int i = 0; i < values.length; i++) {
            comparisons++;
            if (values[i] == target) {
                return comparisons;
            }
        }
        return comparisons;
    }
}