import java.util.Scanner;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[10];

        // Prompt the user to enter a number for each array element.
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            int value = s.nextInt();

            num[i] = value;
        }

        int max = num[0];
        int min = num[0];

        // Update and check max/min.
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}