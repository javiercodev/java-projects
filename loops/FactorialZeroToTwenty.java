import java.util.Scanner;

public class FactorialZeroToTwenty {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        boolean isRange = false;
        do {
            System.out.print("Enter a number: ");
            n = s.nextInt();

            isRange = n >= 0 && n <= 20;

            if (!isRange) {
                System.out.println("invalid number!");
            }
        } while (!isRange);

        // Store the value in a long, since factorials grow quickly.
        long factorial = 1;

        // Here is the factorial formula: n! = n × (n - 1) × (n - 2) × ... × 2 × 1.
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.print(factorial);
    }
}