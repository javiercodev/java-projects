import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Numbers:
        System.out.print("Enter a number:");
        double firstValue = s.nextDouble();
        System.out.print("Enter another number:");
        double secondValue = s.nextDouble();
        // Operation:
        System.out.print("Enter the operation:");
        char operation = s.next().charAt(0);
        s.close();

        double result = 0;

        switch (operation) {
            case '+': 
                result = firstValue + secondValue;
                break;
            case '-':
                result = firstValue - secondValue;
                break;
            case '*':
                result = firstValue * secondValue;
                break;
            case '/':
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                } else {
                    System.out.print("You can't divide by zero, mate");
                    return;
                }
                break;
            default:
                System.out.print("invalid operator!");
        }

        System.out.printf("Result:" + " %.2f", result);    
    }
}