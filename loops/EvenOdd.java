import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number = 0;
        String select = "";
        boolean next = false;

        do {
            System.out.print("Introduce a number: ");
            number = Integer.parseInt(s.nextLine());

            if (number % 2 == 0) {
                System.out.println("The number " + number + " is so good");
            } else {
                System.out.println("Sorry, I dont like the number " + number);
            }

            System.out.print("You want to continue? (Y/N): ");
            select = s.nextLine();
            switch (select) {
                case "Y":
                    next = true;
                    break;
                case "N":
                    next = false;
                    break;
                default:
                    next = true;
                    break;
            }
        } while (next);
    }
}