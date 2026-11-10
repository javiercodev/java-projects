import java.util.Scanner;

public class AddSecondsToTime {

    // Time units:
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_DAY = 86400;

    // Limits:
    private static final int MAX_HOUR = 23;
    private static final int MAX_MINUTE_OR_SECOND = 59;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int hh = readIntInRange(s, "Hours (0-" + MAX_HOUR + "): ", 0, MAX_HOUR);
            int mm = readIntInRange(s, "Minutes (0-" + MAX_MINUTE_OR_SECOND + "): ", 0, MAX_MINUTE_OR_SECOND);
            int ss = readIntInRange(s, "Seconds (0-" + MAX_MINUTE_OR_SECOND + "): ", 0, MAX_MINUTE_OR_SECOND);
            long n = readNonNegativeLong(s, "Seconds to add: ");

            long total = toSeconds(hh, mm, ss) + n;

            System.out.println(formatTime(total % SECONDS_PER_DAY));
            System.out.println("Days advanced: " + daysAdvanced(total));
        }
    }

    // Converts a time of day to seconds since 00:00:00.
    private static long toSeconds (int hh, int mm, int ss) {
        return (long) hh * SECONDS_PER_HOUR + mm * SECONDS_PER_MINUTE + ss;
    }

    // Whole days contained in a total number of seconds.
    private static long daysAdvanced (long total) {
        return total / SECONDS_PER_DAY;
    } 

    // Formats seconds within a day (0-86399) as hh:mm:ss.
    private static String formatTime(long secondsOfDay) {
        long hours = secondsOfDay / SECONDS_PER_HOUR;
        long minutes = (secondsOfDay % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        long seconds = secondsOfDay % SECONDS_PER_MINUTE;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Repeat until the user enters a valid integer number.
    private static int readInt(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    // Asks for an integer within [min, max], repeating until valid.
    private static int readIntInRange(Scanner s, String prompt, int min, int max) {
        while (true) {
            int value = readInt(s, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("number out of range!");
        }
    }

    // Asks for a long >= 0, repeating until the input is valid.
    private static long readNonNegativeLong (Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                long value = Long.parseLong(s.nextLine().trim());
                if (value >= 0) {
                    return value;
                }
                System.out.println("the number cannot be negative!");
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }
}