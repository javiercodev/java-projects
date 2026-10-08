import java.util.Scanner;

public class FindDigitPositions {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = s.nextLine();
        System.out.print("Enter a digit: ");
        String digit = s.nextLine();

        for (int i = 0; i < number.length(); i++) {

            if (digit.charAt(0) == number.charAt(i)) {
                System.out.println("Position: " + i);
            }
        }
    }
}