import java.util.Scanner;

public class PrintNumbersOneToN {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            // Avoid a trailing comma.
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}