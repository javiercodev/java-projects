import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random  r = new Random();

        int randomNumber = r.nextInt(100) + 1;
        
        // Only see in debug.
        System.out.println(randomNumber);

        int number = 0;

        do {
        System.out.print("Enter a number: ");
        number = s.nextInt();

        if (number == randomNumber) {
            System.out.println("Correct!");
        } else if (number > (randomNumber + 11) || number < (randomNumber - 11)) {
            System.out.println("So Far! Try again.");
        } else if (number > (randomNumber + 6) || (number < (randomNumber - 6))) {
            System.out.println("You're getting closer! Try again.");
        } else if (number > (randomNumber + 2) || number < (randomNumber + 2)) {
            System.out.println("You're very close!. Try again.");
        }
    
        } while (number != randomNumber);
    }
}