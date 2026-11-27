import java.util.Arrays;

public class SelectionSortDescending {

    public static void main(String[] args) {
        int[] numbers = {15, 3, 28, 7, 19, 1};
        selectionSort(numbers);
        System.out.println("Result: " + Arrays.toString(numbers));
    }

    private static void selectionSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] > values[maxIndex]) {
                    maxIndex = j;
                }
            }
            int aux = values[i];
            values[i] = values[maxIndex];
            values[maxIndex] = aux;
        }
    }
}