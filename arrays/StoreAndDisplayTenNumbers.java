import java.util.Scanner;

public class StoreAndDisplayTenNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter a value for position " + i + ": ");
            int number = s.nextInt();
            values[i] = number;
        }

        for (int i : values) {
            System.out.print(i);
        }

        s.close();
    }
}