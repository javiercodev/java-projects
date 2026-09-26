import java.util.Scanner;

public class DaysCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of a month: ");
        int month = s.nextInt();

        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.print("31 Days");
            case 4, 6, 9, 11 -> System.out.print("30 Days");
            case 2 -> System.out.print("28 Days");
            default -> System.out.print("Incorrect");
        }
    }
}