import java.util.Scanner;

public class PrintCharacterOneByOne {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Say something: ");
        String word = s.next();
        s.close();

        // Display the entered word by iterating through each of its characters.
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        System.out.println("");

        // Now display it in reverse order.
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }
    }
}