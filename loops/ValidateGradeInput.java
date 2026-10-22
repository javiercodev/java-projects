import java.util.Scanner;

public class ValidateGradeInput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        boolean isRange =  false;

        do {
            System.out.print("Enter a grade: ");
            n = s.nextInt();

            isRange = n >= 0 && n <= 10;

            if (!isRange) {
                System.out.println("invalid number!");
            }

        } while (!isRange);
    }
}