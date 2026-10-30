import java.util.Random;

public class FindArrayMaxMinPositions {

    public static void main(String[] args) {

        Random r = new Random();

        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            int random = r.nextInt(101);
            num[i] = random;
        }

        int max = num[0];
        int maxPos = 0;
        int min = num[0];
        int minPos = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxPos = i;
            }
            if (num[i] < min) {
                min = num[i];
                minPos = i;
            }
        }
        
        System.out.println("The maximum value is " + max + " and its position is " + maxPos);
        System.out.println("The min is: " + min + " and its position is " + minPos);
    }
}