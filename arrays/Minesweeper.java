import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    
    private static final int SIZE = 20;
    private static final int MINES = 4;

    // Possible results of revealing a cell.
    private static final int RESULT_SAFE = 0;
    private static final int RESULT_MINE = 1;
    private static final int RESULT_REPEATED = 2;

    public static void main(String[] args) {
        if (MINES < 0 || MINES >= SIZE) {
            System.out.println("invalid configuration: mines must be fewer than cells!");
            return;
        }

        boolean[] mines = new boolean[SIZE];
        boolean[] revealed = new boolean[SIZE];
        placeMines(mines, MINES, new Random());
        int safeCellsLeft = SIZE - MINES;

        try (Scanner s = new Scanner(System.in)) {
            showBoard(mines, revealed, false);
            while (safeCellsLeft > 0) {
                int position = readIntInRange(s, "Position (0-" + (SIZE - 1) + "): ", 0, SIZE - 1);
                int result = reveal(mines, revealed, position);
                if (result == RESULT_REPEATED) {
                    System.out.println("You already revealed that cell!");
                } else if (result == RESULT_MINE) {
                    showBoard(mines, revealed, true);
                    System.out.println("BOOM!");
                    return;
                } else {
                    safeCellsLeft--;
                    showBoard(mines, revealed, false);
                }
            }
            System.out.println("You cleared the board. You win!");
        }
    }

    // Places exactly 'count' mines in different random cells.
    private static void placeMines(boolean[] mines, int count, Random r) {
        int placed = 0;
        while(placed < count) {
            int position = r.nextInt(mines.length);
            if (!mines[position]) {
                mines[position] = true;
                placed++;
            }
        }
    }

    // Applies one move and returns what happened (no input or output here).
    private static int reveal(boolean[] mines, boolean[] revealed, int position) {
        if (revealed[position]) {
            return RESULT_REPEATED;
        }
        if (mines[position]) {
            return RESULT_MINE;
        }
        revealed[position] = true;
        return RESULT_SAFE;
    }

    // Counts the mines int the left and right neighbours.
    private static int adjacentMines(boolean[] mines, int position) {
        int count = 0;
        if (position > 0 && mines[position - 1]) { count ++; } // Left.
        if (position < mines.length - 1 && mines[position + 1]) { count++; } // Right.
        return count;
    }

    // Prints two rows: indices and cells ('#' hidden, digit = nearby mines, '*' mine).
    private static void showBoard(boolean[] mines, boolean[] revealed, boolean showMines) {
        for (int i = 0; i < mines.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < mines.length; i++) {
            char cell = '#';
            if (revealed[i]) {
                cell = (char) ('0' + adjacentMines(mines, i));
            } else if (showMines && mines[i]) {
                cell = '*';
            }
            System.out.printf("%2c ", cell);
        }
        System.out.println();
        System.out.println();
    }

    // Asks for an integer within [min, max], repeating until valid.
    private static int readIntInRange(Scanner s, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(s.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("enter a position between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("invalid num!");
            }
        }
    }
}