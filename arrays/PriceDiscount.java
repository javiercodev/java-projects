import java.util.Scanner;
import java.util.Random;

public class PriceDiscount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double sum = 0;
        double price = 0;
        
        do {
            System.out.print("Enter the price (to abort enter -1): ");
            price = s.nextDouble();
            if (price != -1) {
                sum += price;
            }
        } while (price != -1);

        s.close();

        System.out.println("sum: " + sum);

        Random r = new Random();
        int[] discountRandom = {5, 10, 20, 0}; // 0 represents the fixed $5 discount.
        int discountSelect = discountRandom[r.nextInt(discountRandom.length)];

        double total = 0;

        if (sum > 100) {
            switch (discountSelect) {
                case 5:
                    total = sum * 0.95;
                    break;
                case 10:
                    total = sum * 0.90;
                    break;
                case 20:
                    total = sum * 0.80;
                    break;
                case 0:
                    total = sum - 5;
                    break;
            }  
        } else {
            total = sum;
        }

        System.out.println("discountSelect: " + discountSelect);
        System.out.println("total: " + total);
    } 
}
