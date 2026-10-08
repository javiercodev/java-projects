import java.util.Scanner;

public class RangeNumbers {

    public static void main(String[] args) { 

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = s.nextInt();
        System.out.print("Enter another number: ");
        int number2 = s.nextInt();

        for (int i = number1; i <= number2; i = i + 7) {System.out.println(i);}
    }
}