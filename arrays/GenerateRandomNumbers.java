import java.util.Random;

public class GenerateRandomNumbers{

    public static void main(String[] args) {

        Random r = new Random();

        int[] arrayRandom = new int[15];
        for(int i = 0; i < arrayRandom.length; i++) {
            int random = r.nextInt(100) + 1;
            arrayRandom[i] = random;
        }

        for (int j : arrayRandom) {
            System.out.print(j + " ");
        }
    }
}