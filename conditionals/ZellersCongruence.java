import java.util.Scanner;

public class ZellersCongruence {

    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;
    private static final int MIN_DAY = 1;
    private static final int MIN_YEAR = 1;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            printDayOfWeek(s);
        }
    }

    private static void printDayOfWeek(Scanner s){
        // Ask the user to enter the day, month, year.
        int day = readInt(s, "Enter the day: ");
        int month = readInt(s, "Enter the month: ");
        int year = readInt(s, "Enter the year: ");

        // Check whether the month and day are within the valid range.
        if (year < MIN_YEAR || month < MIN_MONTH || month > MAX_MONTH || day < MIN_DAY || day > daysInMonth(month, year)){
            System.out.println("invalid date!");
        } else {
            // Zeller's year starts in March: January and February count as months 12 and 14 of the previous year, so the leap day falls at the end.
            if (month < 3) {
                month +=12;
                year -= 1;
            }

            int K = year % 100;
            int J = year / 100;

            int h = (day + 13 * (month + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

            String[] names = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            System.out.println(names[h]);
        }
    }

    private static int readInt(Scanner s, String prompt) {
        // Repeat until the user enters a valid number
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int daysInMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29:28;
            default -> 31;
        };
    }
}