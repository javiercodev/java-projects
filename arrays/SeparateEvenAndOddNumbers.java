import java.util.Random;

public class SeparateEvenAndOddNumbers {

    public static void main(String[] args) {

        Random r = new Random();
        // Create even and odd counters so we can later create an array of the appropriate size for each.
        int even = 0;
        int odd = 0;
        int[] randomArray = new int[15];
        for (int i = 0; i < randomArray.length; i++) {
            // Generate a random number between 1 and 50 for each position.
            int random = r.nextInt(50) + 1;
            randomArray[i] = random;
            if (randomArray[i] % 2 == 0) {
                // Count even.
                even++;
            } else {
                // Count odd.
                odd++;
            }
        }
        
        int[] evenArray = new int[even];
        int[] oddArray = new int[odd];
        // Create and index for evenArray and oddArray to keep track of their positions.
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                evenArray[evenIndex] = randomArray[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = randomArray[i];
                oddIndex++;
            }
        }

        System.out.print("Generated numbers: ");
        for (int i : randomArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Even: ");
        for (int i : evenArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd: ");
        for (int i : oddArray) {
            System.out.print(i + " ");
        }
    }
}