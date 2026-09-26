import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        double number1 = Double.parseDouble(s.nextLine());

        System.out.print("Introduce another number: ");
        double number2 = Double.parseDouble(s.nextLine());

        System.out.print("Introduce the operation: ");
        String operation = s.nextLine();

        double total = 0.0;

        switch(operation) {
            case "Add":
            total = number1 + number2;
            System.out.print("The sum of " + number1 + " and " + number2 + " is " + total);
            break;
            
            case "Subtract":
            total = number1 - number2;
            System.out.print("The subtraction of " + number1 + " and " + number2 + " is " + total);
            break;

            case "Multiply":
            total = number1 * number2;
            System.out.print("The multiplication of " + number1 + " and " + number2 + " is " + total);
            break;

            case "Split":
            total = number1 / number2;
            System.out.print("The divison of " + number1 + " and " + number2 + " is " + total);
            break;
            
        }
    }
}