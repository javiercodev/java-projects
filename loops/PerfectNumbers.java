public class PerfectNumbers {

    public static void main(String[] args) {

        final int LIMIT = 10000;

        for (int i = 1; i <= LIMIT; i++) {
            int divisors = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisors += j; 
                }
            }

            boolean isPerfectNumber = (i == divisors);
            
            if (isPerfectNumber) {
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}