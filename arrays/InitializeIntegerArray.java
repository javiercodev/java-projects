public class InitializeIntegerArray {

    public static void main(String[] args) {

        int[] values = new int[12];
        values[0] = 39; 
        values[1] = -2;
        values[4] = 0;
        values[6] = 14;
        values[8] = 5;
        values[9] = 120;

        for (int i = 0; i < 12; i++) {
            System.out.println(values[i]);
        }
    }
}