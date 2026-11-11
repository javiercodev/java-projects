import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num = readIntGreaterThanOne(s, "Enter a number greater than one: ");
            printFactorization(num);
        }
    }

    // Asks for an integer greater than 1, repeating until valid.
    private static int readIntGreaterThanOne(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int num = Integer.parseInt(s.nextLine().trim());
                if (num > 1) {
                    return num;
                } else {
                    System.out.println("num is not greater than one!");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Prints the prime factors of n with exponents, e.g. 2^3 · 3^2 · 5.
    private static void printFactorization(int n) {
        int divisor = 2;
        boolean first = true; // Declared outside the loop to remenber the first factor.
        while (n > 1) {
            int exponent = 0;
            // Exhausts the current divisor before moving to the next one.
            while (n % divisor == 0) {
                n /= divisor;
                exponent++;
            }
            if (exponent > 0) {
                if (!first) { System.out.print(" · "); }
                System.out.print(divisor);
                // Exponent 1 is not written
                if (exponent > 1) { System.out.print("^" + exponent); }
                first = false;
            }
            divisor++;
        }

        System.out.println();
    }
}