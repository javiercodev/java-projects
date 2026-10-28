import java.util.Scanner;

public class SumAndAverageArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a value for position " + i + ": ");
            int enteredNum = s.nextInt();
            num[i] = enteredNum;
        }

        s.close();

        int sum = 0;
        for (int j : num) {
            sum += j;
        }
        System.out.println("The sum of all is: " + sum);

        double average = (double) sum / num.length;
        System.out.printf("The average is: %.2f", average);

    }
}