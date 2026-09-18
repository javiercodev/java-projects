import java.util.Scanner;

public class ScannerClass03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce 3 numbers(int or double) with space");
        double number1 = s.nextDouble();
        double number2 = s.nextDouble();
        double number3 = s.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.print("The average is " + average);


    }
}