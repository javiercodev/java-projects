import java.io.FileReader;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = s.nextInt();
        int i = 1;
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int b = 0;
        int result = 0;

        while (i <= number) {
            System.out.print(firstFibonacci + " " + secondFibonacci + " ");
            firstFibonacci = firstFibonacci + secondFibonacci;
            secondFibonacci = firstFibonacci + secondFibonacci;
            i++;
        }
    }
}