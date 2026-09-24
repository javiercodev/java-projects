import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce a year: ");
        int year = s.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.print("It´s a leap year");
        } else {
            System.out.print("it's not a leap year");
        }
    }
}