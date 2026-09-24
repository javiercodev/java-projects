import java.util.Scanner;

public class PassedFailed {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce calification: ");
        double calification = s.nextDouble();

        if(calification < 5) {
            System.out.print("Failed");
        } else if (calification >= 5 && calification <= 6.9) {
            System.out.print("Passed");
        } else if (calification >= 7 && calification <= 8.9) {
            System.out.print("Notable");
        } else if (calification >= 9 && calification <= 10) {
            System.out.print("Outstanding");
        } else {
            System.out.print("System Error");
        }
    }
}