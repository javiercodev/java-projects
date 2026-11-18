import java.util.Random;

public class ArrayMethods {

    public static void main(String[] args) {
        int[] vector = {10, 17, 22, 36, 45};

        System.out.println("==================== INFO ARRAY ====================");

        System.out.println("Sum: " + sumVector(vector));
        System.out.println("Max value: " + maxValue(vector));
        System.out.println("Average: " + averageVector(vector));
        System.out.println("Even values:" + evenVector(vector));
        System.out.println("Ordered: " + isOrderVector(vector));
        showVector(vector);

        System.out.print("Reversed: ");
        int[] reversed = reverseVector(vector);
        showVector(reversed);

        Random r = new Random();
        System.out.print("Generate random values: ");
        randomVector(r, vector, 5, 75);
        showVector(vector);

        System.out.println("====================================================");
    }

    private static int sumVector(int[] vector) {
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
        }
        return total;
    }

    private static int maxValue(int[] vector) {
        int max = 0;
        boolean first = true;
        for (int i = 0; i < vector.length; i++) {
            if (first) {
                max = vector[i];
                first = false;
            }
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    private static double averageVector(int[] vector) {
        return (double) sumVector(vector) / vector.length;
    }

    private static int evenVector(int[] vector) {
        int even = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) { even++; }
        }
        return even;
    }

    private static boolean isOrderVector(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void showVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i != vector.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }

    private static int[] reverseVector(int[] vector) {
        int[] reversed = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            reversed[i] = vector[vector.length - 1 - i];
        }
        return reversed;
    }

    private static void randomVector(Random r, int[] vector, int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            int random = r.nextInt((max - min) + 1) + min;
            vector[i] = random;
        }
    }
}