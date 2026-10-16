import java.util.Scanner;

public class MonthlyTemperature {

    public static void main(String[] args) {

        // Store the month names.
        String[] nameMonth = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner s = new Scanner(System.in);

        int temp;
        int[] tempValue = new int[12];

        // Store the month temps.
        for (int i = 0; i < nameMonth.length; i++) {
            System.out.print("Enter the temperature for " + nameMonth[i] + ": ");
            temp = s.nextInt();
            tempValue[i] = temp;
        }

        s.close();

        // Draw asterisks for each month's temps, from 0 to the entered value.
        for (int i = 0; i < tempValue.length; i++) {
            System.out.print(nameMonth[i] + ": ");

            for (int j = 0; j < tempValue[i]; j++) {
                System.out.print('*');
            }
            
            System.out.print(" " + tempValue[i]);
            System.out.println();
        }
    }
}