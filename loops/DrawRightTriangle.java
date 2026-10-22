import java.util.Scanner;

public class DrawRightTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int N = s.nextInt();
        s.close();

        // This first for loop creates a line break.
        for (int i = 0; i <= N; i++) {
            // This loop repeats the asterisk according to the value of i.
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}