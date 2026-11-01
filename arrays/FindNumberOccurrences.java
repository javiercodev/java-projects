import java.util.Random;
import java.util.Scanner;

public class FindNumberOccurrences {

    public static void main(String[] args) {

        Random r = new Random();
        // Fill an array with random numbers between 1 and 20.
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            // nextInt(20) generates values from 0 to 19.
            int random = r.nextInt(20) + 1; // Adding 1 shifts the range to 1 to 20.
            randomArray[i] =  random;
            System.out.print(randomArray[i] + " ");
        }

        System.out.println();

        Scanner s = new Scanner(System.in);
        // isFound allows us to ask again if the entered value was not found.
        boolean isFound = false;
        do {
            // total tells us whether any matching value has been found.
            int total = 0;
            System.out.print("Enter a number: ");
            int numToSearch = s.nextInt();
            for (int j = 0; j < randomArray.length; j++) {
                if (numToSearch == randomArray[j]) {
                    System.out.println("Found in position: " + j);
                    // A matching value has been found.
                    total++;
                }
            }

            isFound = total > 0;

            if (!isFound) {
                System.out.println("not found!");
                // isTryAgain asks whether the user wants to try again after invalid input.
                boolean isTryAgain = false;
                do {
                    System.out.print("try another value?(y/n): ");
                    char tryAgain = s.next().charAt(0);
                    switch(tryAgain) {
                        case 'y':
                            // Continue and try again.
                            isTryAgain = true;
                            break;
                        case 'n':
                            // Stop the program.
                            System.out.print("bye");
                            s.close();
                            return;
                        default:
                            // Repeat the ask.
                            isTryAgain = false;
                    }
                } while (!isTryAgain);
            }
        } while (!isFound);
    }
}