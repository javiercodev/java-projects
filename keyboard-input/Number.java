public class Number {

    public static void main(String [] args) {

        String line;

        System.out.print("Select a number ");
        line = System.console().readLine();
        int firstNumber;
        firstNumber = Integer.parseInt(line);

        System.out.print("Pls, select another number ");
        line = System.console().readLine();
        int secondNumber;
        secondNumber = Integer.parseInt(line);

        int total = firstNumber + secondNumber;

        System.out.print("Total: " + total);
    }
}