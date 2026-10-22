import java.util.Scanner;

public class DrawNumberTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int N = s.nextInt();
        s.close();

        // This first for loop creates a line break.
        for (int i = 0; i <= N + 1; i++) {
            // This loop show numbers in order according to the value of i.
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}