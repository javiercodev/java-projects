public class Taxi {

    public static void main(String[] args) {

        double distanceKm = 5;
        boolean isNight = true;
        double base = 3;
        double price = 0;

        price = (distanceKm * 1.5) + base;

        if (isNight) {
            price = price * 1.20;
        }

        System.out.print("Price: " + price);
    }
}