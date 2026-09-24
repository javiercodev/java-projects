import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the price: ");
        double price = s.nextDouble();

        if (price > 100) {
            price = price * 0.85;
            System.out.print("15% Applied: " + price);
        } else if (price >= 0 && price <= 100) {
            System.out.print("Without Discount: " + price);
        } else {
            System.out.print("System Error");
        }
    }
}