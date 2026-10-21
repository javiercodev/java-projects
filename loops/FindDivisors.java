import java.util.Scanner;

public class FindDivisors {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        final int NUM = s.nextInt();
        s.close();

        int result = 0;

        // We iterate form NUM down to 1.
        // Since NUM is divided by each divisor, the results are displayed in ascending order.
        for (int i = NUM; i >= 1; i--) {

            if (NUM % i == 0) {
                result = NUM / i;
                System.out.print(result + " ");
            }
        }
    }
}