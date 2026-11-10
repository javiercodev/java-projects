import java.util.Scanner;

public class NumericPalindrome {

    private static final int MIN_FOUR_DIGIT = 1000;
    private static final int MAX_FOUR_DIGIT = 9999;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = readPositiveInt(s);
            if (isPalindrome(n)) {
                System.out.println("Is a palindrome");
            } else {
                System.out.println("Is NOT a palindrome");
            }

            printFourDigitPalindromes();

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
    private static int readPositiveInt(Scanner s) {
        while (true) {
            int n = readInt(s, "Enter a positive number: ");
            if (n > 0) {
                return n;
            } else {
                System.out.println("number is not positive!");
            }
        }
    }

    // Builds the reversed number using only % 10 and / 10.
    private static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    // True if the number reads the same forwards and backwards.
    private static boolean isPalindrome(int n) {
        return reverse(n) == n;
    }

    // Prints the four-digit palindromes that are multiples of 11, and how many there are.
    // A four-digit palindrome is abba = 1001a + 110b = 11 * (91a + 10b), so all of them are multiples of 11: the filter discards none (total 90).
    private static void printFourDigitPalindromes() {
        System.out.println("Displaying four-digit palindromes that are multiples of 11:");
        int count = 0;
        for (int i = MIN_FOUR_DIGIT; i <= MAX_FOUR_DIGIT; i++) {
            if (isPalindrome(i) && i % 11 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total: " + count);
    }
}