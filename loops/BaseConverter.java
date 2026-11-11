import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = readPositiveInt(s, "Enter a positive number: ");
            int base = readBase(s, "Enter a base between 2 and 16: ");
            String result = toBase(n, base);
            System.out.println(n + " in base " + base + ":" + result);
        }
    }

    // Asks for an integer, repeating until the input is valid.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Asks for an integer greater than 0, repeating until valid.
    private static int readPositiveInt(Scanner s, String prompt) {
        while (true) {
            int n = readInt(s, prompt);
            if (n > 0) {
                return n;
            } else {
                System.out.println("num is not positive!");
            }
        }
    }

    // Asks for a base between 2 and 16, repeating until valid.
    private static int readBase(Scanner s, String prompt) {
        while (true) {
            int base = readInt(s, prompt);
            if (base >= 2 && base <= 16) {
                return base;
            } else {
                System.out.println("num out of range!");
            }
        }
    }

    // Converts a digit (0-15) to its character: 0-9 stay as they are, 10-15 become A-F.
    private static char digitToChar(int digit) {
        if (digit < 10) {
            return (char) ('0' + digit);
        } else {
            return (char) ('A' + digit - 10);
        }
    }

    // Converts n to the given base by dividing repeatedly, e.g. 10 in base 2 is 1010.
    private static String toBase(int n, int base) {
       String result = "";
       while (n > 0) {
            int digit = n % base; // The remainder is the next digit, starting from the right.
            
            result =  digitToChar(digit) + result;
            n /= base;
       }
       return result;
    }
}