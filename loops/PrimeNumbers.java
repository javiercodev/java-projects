import java.util.Scanner;

public class PrimeNumbers{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = s.nextInt();
        boolean isPrime = number > 1;
        int i = 2;

        while (i < number)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime)
        {
            System.out.print("Is a primer number.");
        } else {
            System.out.print("Is not a prime number.");
        }
    }
}