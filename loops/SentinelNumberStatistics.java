import java.util.Scanner;

public class SentinelNumberStatistics {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        int readNum = 0;
        int sum = 0;
        int positive = 0;
        int negative = 0;

        do {
            System.out.print("Enter a number: ");
            num = s.nextInt();
            if (num != 0) {
                // Check wich numbers are positive and which are negative.
                if (num > 0) {
                    positive++;
                } else {
                    negative++;
                }
                // Display how many numbers have been read.
                readNum++;
                // Display the sum of all the numbers entered.
                sum = sum + num;
            }
        } while (num != 0);

        System.out.println(readNum + " numbers have been read");
        System.out.println(sum + " is the sum of the numbers entered");

        // Calculate the average.
        double average = (double) sum / readNum;
        System.out.printf("%.2f is the average of the numbers entered \n", average);

        System.out.println(positive + " are positives");
        System.out.println(negative + " are negatives");
    }
}