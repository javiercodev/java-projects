import java.util.Scanner;

public class NumberCalculatorMenu {

    // Options:
    private static final int OPTION_EXIT      = 0;
    private static final int OPTION_PRIME     = 1;
    private static final int OPTION_FACTORIAL = 2;
    private static final int OPTION_DIGITS    = 3;

    // Limits:
    private static final int MAX_FACTORIAL_INPUT = 20;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = s.nextLine().trim();

            int operations = 0;
            while (true) {
                printMenu();
                int option = readInt(s, "Choose an option: ");

                if (option == OPTION_EXIT) {
                    break;
                }
                if (option < OPTION_PRIME || option > OPTION_DIGITS) {
                    System.out.println("invalid option! try again.");
                    continue;
                }

                runOption(option, s);
                operations++;
            }

            System.out.print(name + ", you have performed " + operations + " operations.");
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1. PRIME NUMBER");
        System.out.println("2. FACTORIAL NUMBER (0-" + MAX_FACTORIAL_INPUT+ ")");
        System.out.println("3. COUNT DIGITS");
        System.out.println("0. EXIT");
    }

    private static void runOption(int option, Scanner s) {
        switch (option) {
            case OPTION_PRIME -> {
                int num = readInt(s, "Enter a number: ");
                System.out.println(num + (isPrime(num) ? " is prime" : " is not prime"));
            }
            case OPTION_FACTORIAL -> {
                int num = readIntInRange(s, "Enter a number", 0, MAX_FACTORIAL_INPUT);
                System.out.println(num + "! = " + factorial(num));
            }
            case OPTION_DIGITS -> {
                int num = readInt(s, "Enter a number: ");
                System.out.println(num + " has " + countDigits(num) + " digits");
            }
        }
    }

    // Logic (pure and easy to test).
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; (long) i * i <= n; i+= 2) {
            if (n % i == 0) return false;
        } 
        return true;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int countDigits(int n) {
        return Long.toString(Math.abs((long) n)).length();
    }

    // Data input.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("You must enter a valid number.");
            }
        }
    }

    private static int readIntInRange(Scanner s, String prompt, int min, int max) {
        while (true) {
            int value = readInt(s, prompt + " between " + min + " and " + max + ": ");
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("invalid number!");
        }
    }
}