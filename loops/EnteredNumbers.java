import java.util.Scanner;

public class EnteredNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = 0;
        int i = 0;
        int acumulator = 0;
        int numberHigher = 0;

        do {
            System.out.print("Enter a number: ");
            number = s.nextInt();
            
            if (number >= 0 && number % 2 != 0)
            {
                acumulator = acumulator + number;
                i++;
            } 
            else if (number >= 0 && number % 2 == 0)
            {
                if (number > numberHigher) {
                    numberHigher = number;
                }
            }
        } while (number >= 0);

        int average = acumulator / i;
        System.out.println(average);
        System.out.print(numberHigher);
    }
}