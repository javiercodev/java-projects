import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce a number: ");
            number = s.nextInt();
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
    }
}