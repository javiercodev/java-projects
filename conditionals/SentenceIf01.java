import java.util.Scanner;

public class SentenceIf01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("What is the capital of Kiribati?: ");
        String answer = s.nextLine();

        if (answer.equals("Tarawa")) {
            System.out.print("Correct!");
        } else {
            System.out.print("Sorry, Incorrect!");
        }
    }
}