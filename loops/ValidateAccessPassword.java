import java.util.Scanner;

public class ValidateAccessPassword {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String accessKey = "";
        boolean hasSpaces = false;

        do {
            System.out.print("Enter the access key: ");
            accessKey = s.nextLine();
            hasSpaces = false;

            for (int i = 0; i < accessKey.length(); i++) {
                if (accessKey.charAt(i) == ' ') {
                    hasSpaces = true;
                    break;
                }
            }
        } while (accessKey.length() < 8 || hasSpaces);

        System.out.print("Successful!");
        s.close();
    }
}