import java.util.Scanner;

public class CinemaTicketPrice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if (age < 0) {
            System.out.print("I doubt you're that age...");
            return;
        } else if (age > 125) {
            System.out.print("You're damn old!");
            return;
        }

        System.out.print("Enter the day(1-7): ");
        int day = s.nextInt();
        s.close();


        boolean reduced = age <= 12 || age >= 65; 
        int price = 0;

        // Use a switch statement because it's easier to modify the days if needed in the future.
        switch (day) {
            case 1, 2, 4, 5, 6, 7 -> {
                price = reduced ? 4 : 7;
            }
            
            case 3 -> {
                price = reduced ? 4 : 5;
            }

            default -> {
                System.out.print("That's not a valid day...");
                return;
            }
        }

        System.out.print("The price for you is: " + price + "$");
    }
}