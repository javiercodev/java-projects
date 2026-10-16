import java.util.Scanner;

public class LabelEvenOddNum {

    public static void main(String[] args) {

        int[] num = new int[8];
        int enteredNumber;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            enteredNumber = s.nextInt();
            num[i] = enteredNumber;
        }

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " is even ");
            } else {
                System.out.print(num[i] + " is odd ");
            }
            System.out.println();
        }
    }
}