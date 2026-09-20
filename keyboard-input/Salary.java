import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce hours: ");

        double hours = s.nextDouble();

        double salary = (12 * hours);

        System.out.print(salary);
    }
}