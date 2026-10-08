import java.util.Scanner;

public class StoreDiscount {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = s.nextDouble();
        double discount = 0;
        double total = 0;

        if (amount < 500) {
            total = total + amount;
            System.out.print("No discount: " + total );
        } else if (amount >=500 && amount < 1000) {
            discount = 0.95;
            total = (total + amount) * discount;
            System.out.print("Discount 5%: " + total);
        } else if (amount >=1000 && amount < 7000) {
            discount = 0.89;
            total = (total + amount) * discount;
            System.out.print("Discount 11%: " + total);
        } else if (amount >=7000 && amount <=15000) {
            discount = 0.82;
            total = (total + amount) * discount;
            System.out.print("Discount 18%: " + total);
        } else if (amount > 15000) {
            discount = 0.75;
            total = (total + amount) * discount;
            System.out.print("Discount 25%: " + total);
        }
    }
}