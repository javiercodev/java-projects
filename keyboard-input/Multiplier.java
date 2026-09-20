import java.util.Scanner;

public class Multiplier {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Write 2 numbers(with space): ");

        double num1 =  s.nextDouble();
        double num2 =  s.nextDouble();

        double multiplier = num1 * num2;

        System.out.print(multiplier);
    }
}