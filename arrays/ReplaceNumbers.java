import java.util.Random;
import java.util.Scanner;

public class ReplaceNumbers {

    public static void main(String[] args) {

        Random r = new Random();

        int num[] = new int[100];

        // Generate random values for each position in num[].
        for (int i = 0; i < num.length; i++) {
            int randomNumber = r.nextInt(21);
            num[i] = randomNumber;
            System.out.print(num[i] + " ");
        }

        System.out.println();

        Scanner s = new Scanner(System.in);

        int numToChange;
        int numExchange;
        boolean numIsCorrect = false;
        boolean numIsRange = false;

        // Use a do-while in case an incorrect value is entered.
        do {
            System.out.print("Select the number you want to change: ");
            numToChange = s.nextInt();

            // Check numToChange existes in num[], in case the array size changes later.
            for (int i = 0; i < num.length; i++) {
                if (num[i] == numToChange) {
                    numIsCorrect = true;
                    break;
                } else {
                    numIsCorrect = false;
                }
            } 

            System.out.print("Select the value you want to exchange it for: ");
            numExchange = s.nextInt();

            // Check numExchange falls within the randonNumber range.
            if (numExchange >= 0 && numExchange <=20) {
                numIsRange = true;
            } else {
                numIsRange = false;
            }

            if (numIsCorrect == false || numIsRange == false) {
                System.out.println("You fucked something up."); // sorry, this is a joke.
            }

        } while (numIsCorrect == false || numIsRange == false);

        s.close();

        // Display the updated values.
        for (int i = 0; i < num.length; i++) {
            if (numToChange == num[i]) {
                num[i] = numExchange;
            }
            System.out.print(num[i] + " ");
        }
    }
}