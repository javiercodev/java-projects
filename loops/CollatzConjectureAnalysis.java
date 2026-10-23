import java.util.Scanner;

public class CollatzConjectureAnalysis {

    public static void main(String[] args) {

        // Ask for a number and make it is positive.
        Scanner s = new Scanner(System.in);
        int number;
        boolean isPositive = false;
        do {
            System.out.print("Enter a positive number: ");
            number = s.nextInt();
            isPositive = number > 0;
            if (!isPositive) {
                System.out.println("please read carefully, dude. make sure it's positive!");
            }
        } while (!isPositive);
        
        s.close();

        int max = 0;

        while (number > 1) {
            boolean isEven = number % 2 == 0;
            if (isEven) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }

            if (number > max) {
                max = number;
            }

            System.out.println(number);
        }

        System.out.print("The max value is: " + max);
    }
}