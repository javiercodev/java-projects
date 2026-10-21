import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);

    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class SecretNumberBasic {

    public static void main(String[] args) {

        int secretNumber = 7;

        Capture c = new Capture();
        int enteredNumber = c.getNumber();

        String guess = (enteredNumber == secretNumber) ? "YEAH: are you a fortune teller or something?" : "nope!";
        System.out.print(guess);
    }
}