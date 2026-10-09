public class TwoDimensionalArrays {

    public static void main(String[] args) 
    throws InterruptedException {

        int[][] n = new int[3][2];

        n[0][0] = 20;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;

        int row, col;

        for (row = 0; row < 3; row++) {
    
            System.out.print("Rows: " + row + " ");

            for (col = 0; col < 2; col++) {
            System.out.printf("%10d ", n[row][col]);
            Thread.sleep(1000);
            }

        }
        System.out.println();
    }
}