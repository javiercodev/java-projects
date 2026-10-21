import java.util.Scanner;

public class GradeToText {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        double grade = s.nextDouble();

        if (grade < 5) {
            System.out.print("Insufficient.");
        } else if (grade < 6) {
            System.out.print("Sufficient.");
        } else if (grade < 7) {
            System.out.print("Good.");
        } else if (grade < 9) {
            System.out.print("Remarkable.");
        } else if (grade <=10) {
            System.out.print("Excellent!");
        } else {
            System.out.print("invalid grade!");
        }
    }
}