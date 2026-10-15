import java.util.Scanner;

public class IncrementBySevenBetweenNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNum = s.nextInt();
        System.out.print("Enter another number: ");
        int secondNum = s.nextInt();
        s.close();

        int minNum;
        int maxNum;

        if (firstNum > secondNum) {
            maxNum = firstNum;
            minNum = secondNum;
        } else {
            maxNum = secondNum;
            minNum = firstNum;
        }

        for (int i = minNum; i <= maxNum; i = i + 7) {
            System.out.println(i);
        }
    }
}