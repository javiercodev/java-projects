import java.util.Scanner;

public class ReverseArrayOrder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            num[i] = s.nextInt();
        }
        
        // Display the entered numbers in reverse order.
        for (int i = num.length - 1; i >= 0; i--) { 
            System.out.println(num[i]);
        }
    }
}