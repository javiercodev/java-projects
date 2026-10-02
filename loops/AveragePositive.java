import java.util.Scanner;

public class AveragePositive {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i = 0;
        int base = 0;
        int number = 0;
        double average = 0;

        do {
            System.out.print("Introduce a number: ");
            number = s.nextInt();
            if (number >= 0) {
                i++;
                base = base + number;
            } else {
                System.out.println("The number is negative.");
            }
        } while (number >= 0);

        average = base / i;
        System.out.print(average);
    }
}