import java.util.Scanner;

public class DrawSlalomArrow {

    public static void main(String[] args) {

        int height;
        boolean isAcceptedHeight = false;
        String red = "\033[31m";
        String reset = "\033[30m";

        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter the arrow entry height (N >= 6): ");
            height = s.nextInt();

            if (height >= 6) {
                isAcceptedHeight = true;
            } else {
                System.out.println(red + "you f*cked something!" + reset);
            }
            
        } while (!isAcceptedHeight);

        s.close();

        int center = height / 2;
        int pass = 1;

        for (int i = 0; i < height; i++) {
            int distance = (i < center) ? (center - i) : (i - center);
            int space = (center - distance) * pass;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            System.out.println('*');
        }

    }
}