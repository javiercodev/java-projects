public class DefaultArrayValues {

    public static void main(String[] args) {

        int[] intArray       = new int[3];
        double[] doubleArray = new double[3];
        boolean[] boolArray  = new boolean[3];
        String[] strArray    = new String[3];

        // Java automatically initializes array elements with default values: 0 for int, 0.0 for double, false for booleans and null for string.
        for (int i = 0; i < 3; i++) {
            System.out.print(intArray[i] + "\t" + doubleArray[i] + "\t" + boolArray[i] + "\t" + strArray[i]);
            System.out.println();
        }
    }
}