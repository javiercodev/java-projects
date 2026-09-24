import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce your weight and height: ");
        double weight = s.nextDouble();
        double height = s.nextDouble();
        double imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.print("Lower Weight");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.print("Normal Weight");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obesity");
        }
    }
}