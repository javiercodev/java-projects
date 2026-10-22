
import java.util.Scanner;

public class DrawCenteredPyramid {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int HEIGHT = s.nextInt();
        final int WIDTH = (2 * HEIGHT) - 1;
        final int CENTER = WIDTH  / 2;
        s.close();

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {

               if (j >= CENTER - i && j <= CENTER + i) {
                   System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

}