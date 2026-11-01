import java.util.Random;

public class DiceRollHistogram {

    public static void main(String[] args) {

        Random r = new Random();
        int[] counts = new int[6];
        for (int i = 0; i < 6000; i++) {
            int random = r.nextInt(6) + 1;
            counts[random - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.print((i + 1) + ": ");
            // Print one * for evert 50 occurrences.
            for (int j = 0; j < counts[i] / 50; j++) {
                System.out.print('*');
            }

            System.out.println(" (" + counts[i] + ")");
        }
    }
}