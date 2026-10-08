public class HundredPrimeNumbers {

    public static void main(String[] args) {
        
        int number = 2;

        while (number < 100) {
            int i = 2;
            boolean isPrime = true;

            while (i < number) {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
                i++;
            }
            
            if (isPrime) 
            {
                System.out.print(number);
            }
            number++;
        }
    }
}