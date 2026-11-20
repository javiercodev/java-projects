import java.util.Random;
import java.util.Arrays;

public class FillArrayWithoutDuplicates {
 
    public static void main(String[] args) {
        int[] array = new int[15];
        Random r = new Random();
        fillRandomWithoutDuplicates(array, r, 1, 21);
        System.out.println(Arrays.toString(array));
    }

    // Fills the array with random numbers whitout duplicates.
    private static void fillRandomWithoutDuplicates(int[] values, Random r, int min, int max) {
        for (int i = 0; i < values.length; i++) {
            boolean isAppear;
            int random;
            do {
                isAppear = false;
                random = r.nextInt(max - min + 1) + min;
                for (int j = 0; j < i; j++) {
                    if (values[j] == random) { isAppear = true; break; }
                }
            } while (isAppear);
            values[i] = random;
        }
    }
}