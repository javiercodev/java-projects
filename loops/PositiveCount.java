import java.util.Scanner;

public class PositiveCount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int introducedNumber = 0;
        int countNumber = 0;
        int add = 0;

        while (introducedNumber >= 0) {
            introducedNumber = s.nextInt();
            countNumber++;
            add += introducedNumber;
        }

        System.out.print("You have entered " + countNumber + " numbers.");
        System.out.print("The total sum of them is: " + add);
    }
}