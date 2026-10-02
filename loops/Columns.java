import java.util.Scanner;

public class Columns {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        double numberBase = s.nextInt();
        double numberPowTwo = 1;
        double numberPowThree = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.print(numberBase);
            numberPowTwo = Math.pow(numberBase, 2);
            System.out.print("\t" + "Squared: " + numberPowTwo);
            numberPowThree = Math.pow(numberBase, 3);
            System.out.println("\t" + "Cubed: " + numberPowThree);
            numberBase++;
        }
    }
}