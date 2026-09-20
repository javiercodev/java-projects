import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the taxable base: ");
        double taxableBase = Double.parseDouble(s.nextLine());

        System.out.print("Introduce IVA Type(general, reduced, super-reduced): ");
        String ivaType = s.nextLine();

        System.out.print("Introduce promo(nopro, mid, min5 or 5porc: ");
        String promoCode = s.nextLine();

        System.out.println("Taxable base: " + taxableBase);

        double iva = 0;

        if (ivaType.equals("general")) {
            iva = 1.21;
        }   else if (ivaType.equals("reduced")) {
                iva = 1.1;
        }   else if (ivaType.equals("super-reduced")) {
                iva = 1.04;
        }   else {
                System.out.print("Unknow IVA");
        }

        double priceIva = taxableBase * iva;

        System.out.println("IVA : " + priceIva);

        double priceFinal = 0;

         if (promoCode.equals("nopro")) {
            priceFinal = priceIva;
        }   else if (promoCode.equals("mid")) {
                priceFinal = priceIva / 2;
        }   else if (promoCode.equals("min5")) {
                priceFinal = priceIva - 5;
        }   else if (promoCode.equals("5porc")) {
                priceFinal = priceIva * 0.95;
        }   else {
                System.out.print("Unknow promo code");
        }

        System.out.print("Total: " + priceFinal);
    }
}