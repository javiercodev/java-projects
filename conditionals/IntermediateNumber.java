import java.util.Scanner;

public class IntermediateNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce 3 integers numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.print("El numero intermedio es: " + num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            System.out.print("El numero intermedio es: " + num2);
        } else {
            System.out.print("El numero intermedio es: " + num3);
        }
    }
}