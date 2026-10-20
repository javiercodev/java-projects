import java.util.Scanner;

class Capture {
    Scanner s = new Scanner(System.in);

    public int getNumber() {
        System.out.print("Enter a number:");
        int enteredNumber = s.nextInt();
        return enteredNumber;
    }
}

public class SortThreeNumbers {

    public static void main(String[] args) {

        Capture c = new Capture();
        int firstValue = c.getNumber();
        int secondValue = c.getNumber();
        int thirdValue = c.getNumber();

        int temp;

        if (firstValue > secondValue) {
            temp = firstValue;
            firstValue = secondValue;
            secondValue = temp;
        }

        if (firstValue > thirdValue) {
            temp = firstValue;
            firstValue = thirdValue;
            thirdValue = temp;
        }

        if (secondValue > thirdValue) {
            temp = secondValue;
            secondValue = thirdValue;
            thirdValue = temp;
        }

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
    }
}