import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = 1;
        int sum = 0;

        do {
            if (number <= 0) {
                System.out.println("failed to read the number, try again!");
                System.out.print("Enter another number: ");
                number = s.nextInt();
            } else {
                System.out.print("Enter a number: ");
                number = s.nextInt();
            }
        } while (number <= 0);

        for (int i = number + 1; i <= 100 + number; i++) {
            sum = i + sum;
        }   
        
        System.out.print(sum);
    }
}