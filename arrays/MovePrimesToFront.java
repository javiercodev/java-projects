import java.util.ArrayList;
import java.util.Scanner;

// Create a class to read numbers for a change of pace.
class Capture {
    Scanner s = new Scanner(System.in);
    
    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

// Create another class to detect prime numbers.
class PrimeNumber {

    public boolean isPrime(int n) {

        if (n <= 1) {
            return  false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i +=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// Here is the program.
public class MovePrimesToFront {

    public static void main(String[] args) {

        Capture c = new Capture();

        int[] n = new int[10];
        // Assign a value to each position in n[].
        for (int i = 0; i < n.length; i++) {
            int number = c.getNumber();
            n[i] = number;
        }

        // Add a simple index here.
        for (int i = 0; i < n.length; i++) {
            int index = i + 1;
            System.out.println("Index " + index + ": " + n[i]);
        }

        System.out.println("");

        PrimeNumber p = new PrimeNumber();

        // Create dynamic array to store the prime numbers values from n[].
        ArrayList<Integer> groupPrime = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (p.isPrime(n[i])) {
                int prime = n[i];
                groupPrime.add(prime);
            }
        }

        // Create dynamic array to store the composite numbers values from n[].
        ArrayList<Integer> groupComposite = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (!p.isPrime(n[i])) {
                int composite = n[i];
                groupComposite.add(composite);
            }
        }

        // Create a final array that stores the groupPrime values first, followed by the groupComposite values.
        int[] groupPrimeComposite = new int[groupPrime.size() + groupComposite.size()];

        // Save the position for the final array.
        int index = 0;

        // Assign the groupPrime values to the corresponding positions.
        for (int i : groupPrime) {
            groupPrimeComposite[index] = i;
            index++;
        }

        // Assign the groupComposite values to the corresponding positions.
        for (int i : groupComposite) {
            groupPrimeComposite[index] = i;
            index++;
        }

        // The result:
        System.out.println("Group");
        for (int i : groupPrimeComposite) {
            System.out.println(i);
        }
    }
}