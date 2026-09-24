import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("User: ");
        String user = s.nextLine();
        
        System.out.print("Password: ");
        String password = s.nextLine();

        String userData = "javiercodev";
        String passwordData = "123";

        if (user.equals(userData) && password.equals(passwordData)) {
            System.out.print("Successful login");
        } else if (!user.equals(userData) && password.equals(passwordData)){
            System.out.print("Failed: User is wrong");
        } else if (user.equals(userData) && !password.equals(passwordData)) {
            System.out.print(user + " your password is wrong");
        } else {
            System.out.print("System Error");
        }
    }
}