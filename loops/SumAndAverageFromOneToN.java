import java.util.Scanner;

public class SumAndAverageFromOneToN {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int N = s.nextInt();
        s.close();

        int sum = 0;

        // Calculate the sum from 1 to N.
        for (int i = 1; i <= N; i++ ) {
            sum = sum + i;
        }

        System.out.println("The sum is: " + sum);
        
        // And now calculate the average.
        double average = (double) sum / N;
        System.out.printf("The average is: " + "%.2f", average);
    }
}