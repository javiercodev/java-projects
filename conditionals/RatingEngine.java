import java.util.Scanner;

public class RatingEngine {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the logistics zone(PENINSULA/BALEARES/CANARIAS/INT): ");
        String zone = s.nextLine();

        System.out.print("Import the cart: ");
        double purchase = Double.parseDouble(s.nextLine());

        System.out.print("Package weight: ");
        double kg = Double.parseDouble(s.nextLine());

        System.out.print("Coupon type: ");
        String coupon = s.nextLine();

        double shippingCost = 0;
        double extra = 0;
        double excessKg = 0;

        switch (zone) {
            case "PENINSULA":
                if (purchase <= 60) {
                    shippingCost = 6; 
                } else if (purchase > 60) {
                    shippingCost = 0;
                }
                break;
            case "BALEARES":
                if (purchase <= 100) {
                    shippingCost = 12;
                } else if (purchase > 100) {
                    shippingCost = 0;
                }
                if (kg > 5) {
                    excessKg = kg - 5;
                    extra = excessKg * 2;
                }
                break;
            case "CANARIAS":
                shippingCost = 20;
                if (purchase > 150) {
                    extra = 15;
                }
                break;
            case  "INT":
                shippingCost = 35;
                extra = 5 * kg;
                break;
            default:
                System.out.print("Error: Try Again.");
                return;
       }

       if ("PROMO10".equals(coupon) && purchase >=30 ) {
            purchase = purchase * 0.90;
       }
       if ("ENVIOFREE".equals(coupon) && !"CANARIAS".equals(zone) && !"INT".equals(zone)) {
            shippingCost = 0;
       }
       if ("SUPERVIP".equals(coupon)) {
        shippingCost = 0;
        purchase = purchase * 0.80;
       }
       
       double total = purchase + shippingCost + extra;
       System.out.print("Total: " +  total);
    }
}

            

    
