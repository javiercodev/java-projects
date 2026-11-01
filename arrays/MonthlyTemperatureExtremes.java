import java.util.Scanner;

public class MonthlyTemperatureExtremes {

    public static void main(String[] args) {

        String[] month = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        Scanner s = new Scanner(System.in);

        double[] temperature = new double[12];
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Enter the temperature for " + month[i] + ": ");
            double avgTemp = s.nextDouble();
            temperature[i] = avgTemp;
        }

        s.close();

        double maxTemp = temperature[0];
        String maxMonth = month[0];
        double minTemp = temperature[0];
        String minMonth = month[0];
        for (int j = 0; j < month.length; j++) {
            if (temperature[j] > maxTemp) {
                maxTemp = temperature[j];
                maxMonth = month[j];
            } 
            if (temperature[j] < minTemp) {
                minTemp = temperature[j];
                minMonth = month[j];
            }
        }

        System.out.println("The warmest month was: " + maxMonth + " with " + maxTemp + " degrees.");
        System.out.println("The coldest month was: " + minMonth + " with " + minTemp + " degrees.");
    }
}