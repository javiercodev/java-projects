import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = s.nextLine();
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.print(reverse);
    }
}