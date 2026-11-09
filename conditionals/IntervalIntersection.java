import java.util.Scanner;

public class IntervalIntersection {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // Read the endpoints of the two intervals.
            int a = readInt(s, "Enter a number for a: ");
            int b = readInt(s, "Enter a number for b: ");
            int c = readInt(s, "Enter a number for c: ");
            int d = readInt(s, "Enter a number for d: ");
            // Calculate and display the intersection.
            System.out.print(interval(a, b, c, d));
        }
    }

    private static int readInt(Scanner s, String prompt) {
        // Repeat until the user enters a valid number.
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(s.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }

    private static String interval(int a, int b, int c, int d) {
        int temp = 0;
        // Determine whether either interval requires reordering
        String sorting = (a > b || c > d) ? "Sorted automatically in ascending order: " : "You have sorted the numbers in the correct order: ";
       
        // Normalize the first interval.
        if (a > b) { temp = a; a = b; b = temp; }
        // Normalize the second interval.
        if (c > d) { temp = c; c = d; d = temp; }

        System.out.print(sorting);
        System.out.println("[" + a + "," + b + "]" + " " + "[" + c + "," + d + "]");

        // The intersection starts at the greater of the two lower endpoints.
        int start = 0;
        if (a >= c) {
            start = a;
        } else {
            start = c;
        }
        // The intersection ends at the smaller of the two upper endpoints.
        int end = 0;
        if (b <= d) {
            end = b;
        } else {
            end = d;
        }

        // Determine whether the intersection is an interval, a single common point, or an empty set.
        String compare = (start < end) ? ("[" + start + "," + end + "]")
                       : (start == end) ? ("[" + start + "]")
                       : "void";
        return compare;
    }
}
