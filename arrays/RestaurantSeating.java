import java.util.Scanner;
import java.util.Random;

public class RestaurantSeating {

    private static final int NUM_TABLES = 10;
    private static final int MAX_GROUP_SIZE = 4;

    public static void main(String[] args) {
        Random r = new Random();
        int[] tables = new int[NUM_TABLES];
        try (Scanner s = new Scanner(System.in)) {
            fillTables(r, tables);
            printTables(tables);

            while (true) {
                int group = readGroupSize(s);
                // 0 means the user wants to exit.
                if (group == 0) {
                    break;
                }
                if (seatGroup(tables, group)) {
                    printTables(tables);
                } else {
                System.out.println("There is no table available.");
                }
            }
            System.out.println("Goodbye.");
        }
    }

    // Fills every table with a random occupancy from 0 to 4.
    private static void fillTables(Random r, int[] tables) {
        for (int i = 0; i < tables.length; i++) {
            tables[i] = r.nextInt(MAX_GROUP_SIZE + 1); // Upper bound is excluded.
        }
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

    // Asks for the group size (0-4), repeating until valid. Returns 0 to exit.
    private static int readGroupSize(Scanner s) {
        while (true) {
            int group = readInt(s, "How many will there be? (Enter 0 to exit the program): ");
            if (group >= 0 && group <= MAX_GROUP_SIZE) {
                return group; 
            } else{
                System.out.println("Sorry, we do not accept groups of " + group + ".");
            } 
        }
    }

    // Returns the index of the first empty table, or -1 if there is none.
    private static int findEmptyTable(int[] tables) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] == 0) { return i; }
        }
        return -1;
    }

    // Returns the index of the first table with room for the whole group, or -1.
    private static int findTableWithRoom(int[] tables, int group) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] + group <= MAX_GROUP_SIZE) {
                return i;
            }
        }
        return -1;
    }

    // Seats the group: first empty table, else first table with room. False if none.
    private static boolean seatGroup(int[] tables, int group) {
        int index = findEmptyTable(tables);
        // Only look for room if there was no empty table (keeps the priority).
        if (index == -1) {
            index = findTableWithRoom(tables, group);
        }

        if (index == -1) {
            return false;
        }

        tables[index] += group;
        return true;
    }

    // Prints the tables as two rows: table number and occupancy.
    private static void printTables(int[] tables) {
        System.out.print("Table no. |");
        for (int i = 0; i < tables.length; i++) {
        System.out.printf(" %2d |", i + 1);
        }
        System.out.println();

        System.out.print("Occupancy |");
        for (int i = 0; i < tables.length; i++) {
            System.out.printf(" %2d |", tables[i]);
        }
        System.out.println();
        System.out.println();
    }
}