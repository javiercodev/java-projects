import java.util.Scanner;

public class EuclideanAlgorithmMcd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = s.nextInt();
        System.out.print("Enter another number: ");
        int secondNumber = s.nextInt();
        s.close();

        while (firstNumber % secondNumber != 0) {
            int mod = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = mod;
        }

        System.out.print(secondNumber);
    }
}