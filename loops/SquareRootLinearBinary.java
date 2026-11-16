import java.util.Scanner;

public class SquareRootLinearBinary {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long n = readNonNegativeLong(s, "Enter a number non negative: ");
            sqrtLinear(n);
            sqrtBinary(n);
        }

    }

    // Read a non-negative long integer from the user.
    private static long readNonNegativeLong(Scanner s, String prompt) {
        while (true) {  
            System.out.print(prompt);
            try {
                long enteredValue = s.nextLong();
                if (enteredValue >= 0) {
                    return enteredValue;
                } else {
                    System.out.println("negative num!");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Calculate the integer square root by testing consecutive numbers.
    private static void sqrtLinear(long n) {
        long r = 0;
        int iterations = 0;
        while ((r + 1) * (r + 1) <= n) {
            r++;
            iterations++;
        } 
        System.out.println("Result: " + r + " Iterations: " + iterations);
    }

    // Calculate the integer square root using binary search.
    private static void sqrtBinary(long n) {
        long low = 0, high = n;
        long r = 0;
        int iterations = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                r = mid; // mid is valid, but there might be a larger one.
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            iterations++;
        }
        System.out.println("Result: " + r + " Iterations: " + iterations);
    }
}