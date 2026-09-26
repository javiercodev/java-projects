import java.util.Scanner;

public class VehicleRental {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("KM Traveled: ");
        double km = s.nextDouble();
        double base = 30.0;
        double excess = 0.0;
        double amount = 0.0;
        double total = 0.0;

        if(km <=300) {
            total = base;
            System.out.print("You must pay: " + total);
        } else if (km > 300 && km <= 1000) {
            excess = km - 300;
            amount = excess * 0.15;
            total = base + amount;
            System.out.print("Additional amount of 0.15 for the excess over 300: " + total);
        } else if (km > 1000) {
            excess = km - 1000;
            amount = excess * 0.10;
            total = base + amount;
            System.out.print("Additional amount of 0.10 for the excess over 1000: " + total);
        }

    }
}