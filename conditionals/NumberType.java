import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number(int): ");
        int number = s.nextInt();

        if (number > 0) {
            System.out.print("Positive");
        } else if (number == 0) {
            System.out.print("Zero");
        } else {
                System.out.print("Negative");
            }
    }
}