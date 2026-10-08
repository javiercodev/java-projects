import java.util.Scanner;

public class PyramidCharacter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int height = Integer.parseInt(s.next());
        System.out.print("Enter the character: ");
        char character = s.next().charAt(0);

        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }

            System.out.println();
        }  
    }
}