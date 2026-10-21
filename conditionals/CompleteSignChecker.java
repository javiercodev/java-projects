import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);

    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class CompleteSignChecker {

    public static void main(String[] args) {

        Capture c = new Capture();
        int number = c.getNumber();

        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else if (number == 0) {
            System.out.print("Zero");
        }
    }
}