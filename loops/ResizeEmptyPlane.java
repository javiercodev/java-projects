import java.util.Scanner;

public class ResizeEmptyPlane {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height: ");
        final int HEIGHT  = s.nextInt();
        System.out.print("Enter the width: ");
        final int WIDTH = s.nextInt();
        s.close();

        boolean isNegative = HEIGHT < 0 || WIDTH < 0;
        if (isNegative) {
            System.out.print("invalid data!");
            return;
        }

        // Add colors to visualize each part as it is rendered.
        String green = "\033[32m";
        String orange = "\033[33m";
        String blue = "\033[34m";
        String reset = "\033[00m";

        for (int i = 0; i < HEIGHT; i++ ) {
            // If you resize to 0, it will become invisible. That's normal.
            if (HEIGHT >= 1) {

                
                for (int j = 0; j < WIDTH; j++) {
                    // Handles the top part of the plane:
                    // Checks whether the height position is the first one, to draw the first line.
                    if (i == 0) {
                        System.out.print(orange + '*'); 
                    }

                    // Handles the left side: 
                    // Checks that it is between the first and last rows, at the start of the width, so it draws the left border.
                    if ((i >= 1 && i < HEIGHT - 1) && (j == 0)) { 
                        System.out.print(green + '*');  
                    } 
                    // Handles the right side:
                    // Checks that it is between the first and last rows, at the end of the width, so it draws the right border.
                    if ((i >= 1 && i < HEIGHT - 1) && (j == WIDTH - 1)){
                        System.out.print(green + '*');  
                    }

                    // Adds spacing between the sides, creating the outline of an empty rectangle.
                    if ((j < WIDTH - 2) && (i > 0 && i < HEIGHT - 1)) {
                        System.out.print(" ");
                    }

                    // Handles the bottom part.
                    // Checks whether the height position is the last one, to draw the last line.
                    if (i == HEIGHT - 1) {
                        System.out.print(blue + '*');
                    }
                }
            }
                System.out.println();
        }
        System.out.print(reset);
    }
}