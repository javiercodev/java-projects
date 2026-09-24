import java.util.Scanner;

public class AgeVerifier {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce your age: ");
        int age = s.nextInt();

        if(age >= 18) {
            System.out.print("Allowed!");
        } else {
            System.out.print("Not Allowed!");
        }
    }
}