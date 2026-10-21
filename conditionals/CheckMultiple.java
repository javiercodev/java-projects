import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);

    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class CheckMultiple {

    public static void main(String[] args) {

        Capture c = new Capture();
        int a = c.getNumber();
        int b = c.getNumber();

        boolean isZero = b == 0;

        if (isZero) {
            System.out.print("Are you trying to break my program, dude?");
            return;
        }

        String multiple = (a % b == 0) ? "Multiple": "No multiple";
        System.out.print(multiple);
    }
}