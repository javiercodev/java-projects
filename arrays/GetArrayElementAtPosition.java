import java.util.Scanner;

public class GetArrayElementAtPosition {

    public static void main(String[] args) {

        double[] x;
        x = new double[4];

        x[0] =  0.0f;
        x[1] = -0.0f;
        x[2] =  0.5f;
        x[3] = -0.5f;

        Scanner s = new Scanner(System.in);

        System.out.print("Select the position(0-3): ");
        int pos = s.nextInt();
        s.close();

        System.out.print("The element at position " + pos);
        System.out.print(" is " + x[pos]);
    }
}