import java.util.Scanner;

public class Higher {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce 3 numbers: ");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int number3 = s.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is higher than " + number2 + " and " + number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.print(number2 + " is higher than " + number1 + " and " + number3);
        } else if (number3 > number1 && number3 > number2) {
            System.out.print(number3 + " is higher than " + number1 + " and " + number1);
        }
    }
}