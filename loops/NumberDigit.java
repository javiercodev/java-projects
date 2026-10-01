import java.util.Scanner;

public class NumberDigit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = s.nextInt();
        int digit = 0;

        if (number == 0) {
            digit = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                digit++;
            }
        } 

        System.out.print(digit);
    }
}