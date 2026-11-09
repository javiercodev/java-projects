import java.util.Scanner;

public class OverlappingRectangles {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // Read the coordinates of the first rectangle.
            int ax1 = readInt(s, "Enter a number for ax1: ");
            int ay1 = readInt(s, "Enter a number for ay1: "); 
            int ax2 = readInt(s, "Enter a number for ax2: ");
            int ay2 = readInt(s, "Enter a number for ay2: "); 
            // Read the coordinates of the second rectangle.
            int bx1 = readInt(s, "Enter a number for bx1: ");
            int by1 = readInt(s, "Enter a number for by1: ");
            int bx2 = readInt(s, "Enter a number for bx2: ");
            int by2 = readInt(s, "Enter a number for by2: ");
            // Create both rectangles using their coordinates.
            Rectangle a = new Rectangle(ax1, ay1, ax2, ay2);
            Rectangle b = new Rectangle(bx1, by1, bx2, by2);
            // Calculate and display the intersection of the rectangles.
            rectangles(a, b);
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

    // Inner class that represents a rectangle using its corner coordinates.
    static class Rectangle {
        int x1, y1, x2, y2;
        // Initialize the rectangle's coordinates.
        Rectangle(int x1, int y1, int x2, int y2) {
            // Ensure that x1 is always the smallest X coordinate.
            if (x1 > x2) {
                int temp = x1;
                x1 = x2;
                x2 = temp;
            }
            // Ensure that y1 is always the smallest Y coordinate.
            if (y1 > y2) {
                int temp = y1;
                y1 = y2;
                y2 = temp;
            }

            // Assign the ordered coordinates to the object's fields.
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    private static void rectangles(Rectangle a, Rectangle b) {
        // Find the leftmost X coordinate of the intersection.
        int startX = a.x1;
        if (b.x1 > startX) { startX = b.x1; }
        // Find the rightmost X coordinate of the intersection.
        int endX = a.x2;
        if (b.x2 < endX) { endX = b.x2; }

        // Find the bottom Y coordinate of the intersection.
        int startY = a.y1;
        if (b.y1 > startY) { startY = b.y1; }
        // Find the top Y coordinate of the intersection.
        int endY = a.y2;
        if (b.y2 < endY) { endY = b.y2; }

        // Check whether the rectangles do not intersect.
        if (startX > endX || startY > endY) {
            System.out.print("void!");
        // Check whether they only touch at an edge or a corner.
        } else if (startX == endX || startY == endY) {
            System.out.print(startX + " " + startY);
        } else {
            // Calculate the area of the overlapping region.
            int area = (endX - startX) * (endY - startY);
            System.out.print(area);
        }
    }
}