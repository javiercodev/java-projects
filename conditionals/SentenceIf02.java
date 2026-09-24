import java.util.Scanner;

public class SentenceIf02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = s.nextInt();

        if (number < 0) {
            System.out.print("Number is negative");
        } else {
            System.out.print("Number is positive");
        }
    }
}