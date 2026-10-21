import java.util.Scanner;

public class ApplyDiscount {

    public static void main(String[] args) {

        System.out.print("Enter the amount: ");
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        s.close();

        amount = (amount > 50) ? amount * 0.90 : amount;
        System.out.printf("%.2f", amount);
    }
}
