import java.util.Scanner;

public class PrintMultiplesOfThree {

    public static void main(String[] args) {

        // Create a constant to make changing the multiple easier.
        final int MULTIPLE = 3;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int firstValue = s.nextInt();
        System.out.print("Enter another number:");
        int secondValue = s.nextInt();
        s.close();

        // Before entering the loop, if firstValue is greater than secondValue we fix this by assigning them to greater a minor.
        int greater = Math.max(firstValue, secondValue);
        int minor = Math.min(firstValue, secondValue);

        for (int i = minor; i <= greater; i++) {

            if (i % MULTIPLE == 0) {
                System.out.print(i + " ");
            }
        }
    }
}