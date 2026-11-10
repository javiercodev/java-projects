import java.util.Scanner;

public class NextDay {

    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;
    private static final int MIN_DAY = 1;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            printNextDay(s);
        }
    }

    private static void printNextDay (Scanner s){
        // Ask the user to enter the day, month, year.
        int day = readInt(s, "Enter the day: ");
        int month = readInt(s, "Enter the month: ");
        int year = readInt(s, "Enter the year: ");

        // Check whether the month and day are within the valid range.
        if (month < MIN_MONTH || month > MAX_MONTH || day < MIN_DAY || day > daysInMonth(month, year)) {
            System.out.println("invalid date!");
        } else {
            // If the day is not the last day of the month, add one day.
            if (day < daysInMonth(month, year)) {
                day++;
            } else {
                // If it is the last day of the month, reset the day to 1.
                day = 1;
                // If December has ended, move to January of the following year.
                if (month == MAX_MONTH) {
                    month = MIN_MONTH;
                    year++;
                } else {
                    // Otherwise, move to the next month.
                    month++;
                }
            }

            System.out.println(day + "/" + month + "/" + year);
        }
    }

    private static int readInt(Scanner s, String prompt) {
        // Repeat until the user enters a valid number
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("invalid num!");
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