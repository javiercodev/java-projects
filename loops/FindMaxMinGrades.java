import java.util.Scanner;

public class FindMaxMinGrades {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;

        int max = 0;
        int min = 0;

        // Create a boolean for the first assigment, where we set both max and min to num to establish a starting point.
        boolean first = true;

        do {
            System.out.print("Enter a number: ");
            num = s.nextInt();
            if (num != -1) {

                // With this max and min can start comparing.
                if (first) {
                    max = num;
                    min = num;
                    first = false;
                }

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }
        } while (num != -1);

        s.close();

        if (!first) {
            System.out.println("The max: " + max);
            System.out.println("The min: " + min);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}