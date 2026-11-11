import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = readPositiveInt(s, "Enter a number: ");
            int b = readPositiveInt(s, "Enter another number: ");
            // Computed once and reused (b > 0, so the fraction is always valid).
            int mcd = gcd(a, b);
            System.out.println("GCD: " + mcd);
            System.out.println("LCM: " + lcm(a, b));
            System.out.println("Simplified fraction: " + a / mcd + "/" + b / mcd);
        }
    }

    // Asks for an integer greater than 0, repeating until valid.
    private static int readPositiveInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int num = Integer.parseInt(s.nextLine().trim());
                if (num > 0) {
                    return num;
                } else {
                    System.out.println("the number is not positive!");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Euclid's algorithm: gcd(a, b) = gcd(b, a % b) until the remainder is 0.
    private static int gcd(int a, int b) {
        while (b != 0) {
            int mod =  a % b; // Saved first so a is not overwritten to soon.
            a = b;
            b = mod;
        }

        return a;
    }

    // LCM = a / gcd * b. Dividing first and casting early avoids overflow.
    private static long lcm(int a, int b) {
       return (long) a / gcd(a, b) * b;
    }
}