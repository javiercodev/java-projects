import java.util.Scanner;

public class PowersOfTwo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        final int NUM = s.nextInt();
        s.close();

        int power = 1;

        // Display all powers of two less than NUM.
        while (power < NUM) {
            System.out.print(power + " ");
            power = power * 2;
        }
    }
}