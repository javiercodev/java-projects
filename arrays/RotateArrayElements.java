import java.util.Scanner;

public class RotateArrayElements {

    public static void main(String[] args) {

        int[] pos = new int[15];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < pos.length; i++) {
            System.out.print("Enter a number(pos: " + i  + " )" );
            int num = s.nextInt();
            pos[i] = num;
        }

        s.close();

        int aux = pos[pos.length - 1];

        for (int i = pos.length - 1; i > 0; i--) {
            pos[i] = pos[i - 1];
        }

        pos[0] = aux;

        System.out.println("Rotate: ");
        for (int i = 0; i < pos.length; i++) {
            System.out.println(pos[i]);
        }
    }
}

