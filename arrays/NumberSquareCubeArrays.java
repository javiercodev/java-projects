import java.util.Random;

public class NumberSquareCubeArrays {

    public static void main(String[] args) {

        int num[] = new int[20];
        Random r = new Random();
        // Fill num[] array with random values between 0 and 100.
        for (int i = 0; i < num.length; i++) {
            int numRandom = r.nextInt(100 + 1);
            num[i] = numRandom;
            System.out.println("\t" + num[i]);
        }

        int square[] = new int[20];
        // Fill square[] array with the squares of the values in num.
        for (int i = 0; i < square.length; i++) {
            square[i] = (int) Math.pow(num[i], 2);
            System.out.println("\t  " + square[i]);
        }

        int cube[] = new int[20];
        // Fill cube[] array with cubes of the values in num.
        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int) Math.pow(num[i], 3);
            System.out.println("\t      " + cube[i]);
        }
    }
}