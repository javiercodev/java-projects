public class RenderCube {

    private static final int VERTICES = 8;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 24;
    private static final double CAMERA = 4;
    private static final double SCALE = 15;
    private static final int FRAMES = 300;
    private static final int DELAY_MS = 60;

    public static void main(String[] args) {
        // 3D vertices (parallel arrays).
        double[] xs = new double[VERTICES],
                 ys = new double[VERTICES],
                 zs = new double[VERTICES];

        // Position of each vertex on the screen.
        int[] rows = new int[VERTICES],
              cols = new int[VERTICES];

        // Character matrix that represents the screen.
        char[][] screen = new char[HEIGHT][WIDTH];
        initCube(xs, ys, zs);
        
        for (int frame = 0; frame < FRAMES; frame++) {
            clearScreen(screen);
            project(xs, ys, zs, cols, rows);
            drawEdges(screen, cols, rows);
            render(screen);
            // Rotate after drawing, so the first frame is the unrotated cube.
            rotateY(xs, zs, 0.07);
            rotateX(ys, zs, 0.04);
            try {
                Thread.sleep(DELAY_MS);
            } catch (InterruptedException e) {
                return; // Stops the animation if the thread is interrupted.
            }
        }
    }

    // Vertex i takes its signs from the bits of i: 8 combinations of -1 / 1.
    private static void initCube(double[] xs, double[] ys, double[] zs) {
        for (int i = 0; i < VERTICES; i++) {
            if (i % 2 == 0) { xs[i] = -1; } else { xs[i] = 1; }
            if ((i / 2) % 2 == 0) { ys[i] = -1; } else { ys[i] = 1; }
            if ((i / 4) % 2 == 0) { zs[i] = -1; } else { zs[i] = 1; }
        }
    }

    // Fills the whole screen with spaces.
    private static void clearScreen(char[][] screen) {
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = ' ';
            }
        }
    }

    // Clears the terminal and prints the whole frame at once to reduce flicker.
    private static void render(char[][] screen) {
        StringBuilder sb = new StringBuilder("\033[H\033[2J");
        for (int i = 0; i < screen.length; i++) {
            sb.append(screen[i]).append('\n');
        }
        System.out.print(sb);
        System.out.flush();
    }

    // Perspective projection: farther points get closer to the center.
    private static void project(double[] xs, double[]ys, double[] zs, int[] cols, int[] rows) {
        for (int i = 0; i < VERTICES; i++) {
            double factor = SCALE / (zs[i] + CAMERA);
            cols[i] = (int) Math.round(xs[i] * factor * 2) + WIDTH / 2;
            rows[i] = (int) Math.round(-ys[i] * factor) + HEIGHT / 2;       
        }
    }

    // Puts a '*' only if the position is inside the screen.
    private static void plot(char[][] screen, int col, int row) {
        if ((row >= 0 && row < HEIGHT) && (col >= 0 && col < WIDTH)) {
            screen[row][col] = '*';
        } 
    }

    // Rotates every vertex around the Y axis (modifies the arrays).
    private static void rotateY(double[] xs, double[] zs, double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        for (int i = 0; i < VERTICES; i++) {
            // Old values saved first: the second formula needs the original x.
            double x = xs[i];
            double z = zs[i];
            xs[i] = x * cos + z * sin;
            zs[i] = -x * sin + z * cos;
        }
    }

    // Rotates every vertex around the X axis (modifies the arrays).
    private static void rotateX(double[] ys, double[] zs, double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        for (int i = 0; i < ys.length; i++) {
            double y = ys[i];
            double z = zs[i];
            ys[i] = y * cos - z * sin;
            zs[i] = y * sin + z * cos;
        }
    }

    // Joins vertices whose indices differ in exactly one bit (12 edges).
    private static void drawEdges(char[][] screen, int[] cols, int[] rows) {
        for (int i = 0; i < VERTICES; i++) {
            for (int bit = 1; bit <= 4; bit *= 2) {
                // Only when the bit is off, so each edge is drawn once.
                if ((i & bit) == 0) {
                    drawLine(screen, cols[i], rows[i], cols[i | bit], rows[i | bit]);
                }
            }
        }
    }

    // Draws a line by stepping from the first point to the second.
    private static void drawLine(char[][] screen, int c1, int r1, int c2, int r2) {
        // Steps = the longer distance, so no gaps appear in the line.
        int steps = Math.max(Math.abs(c2 - c1), Math.abs(r2 - r1));
        if (steps == 0) {
            plot(screen, c1, r1);
            return;
        }
        for (int k = 0; k <= steps; k++) {
            // Cast before dividing to avoid integer division.
            int col = (int) Math.round(c1 + (double) (c2 - c1) * k / steps);
            int row = (int) Math.round(r1 + (double) (r2 - r1) * k / steps);
            plot(screen, col, row);
        }
    }
}