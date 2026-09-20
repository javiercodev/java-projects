import java.util.Scanner;

public class Taxable {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the taxable base: ");

        double taxableBase = s.nextDouble();
        double total = taxableBase * 1.21;

        System.out.print(total);
    }
}