import java.util.Scanner;

public class ControlAccess {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String passwordData = "95AA";
        String passwordIntroduced = "";
        int attempts = 0;

        do {
            System.out.print("Enter the password: ");
            passwordIntroduced = s.nextLine();

            if (passwordIntroduced.equals(passwordData)) {
                System.out.println("The safe has been successfully opened.");
            } else {
                System.out.println("Sorry, that's not the combination.");
                attempts++;
                int i = 4 - attempts;
                 if (attempts == 4) {
                    System.out.print("You've run out of attempts.");
                    return;
                }
                System.out.println("You have " + i + " attempts.");
            }
        } while (!passwordIntroduced.equals(passwordData));
    }
}