import java.util.Scanner;

public class ClassifyArrayNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a value for position " + i + ": ");
            int value = s.nextInt();
            num[i] = value;
        }

        s.close();

        int isZero     = 0;
        int isPositive = 0;
        int isNegative = 0;
        for (int clasifier : num) {
            if (clasifier == 0) {
                isZero++;
            } else if (clasifier > 0) {
                isPositive++;
            } else {
                isNegative++;
            }
        }

        System.out.println("Zeros: " + isZero);
        System.out.println("Positives: " + isPositive);
        System.out.println("Negatives: " + isNegative);
    }
}