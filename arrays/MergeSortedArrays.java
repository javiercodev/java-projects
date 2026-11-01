import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        // Create two arrays that are already in ascending order.
        int[] array1 = {1, 4, 7, 10};
        int[] array2 = {2, 3, 8, 12, 15};

        // Create an index for each array and one for the result array.
        int i = 0;
        int j = 0;
        int k = 0;

        // Create a result array large enough to hold all elements.
        int[] result = new int[array1.length + array2.length];

        // Compare elements from both arrays neither has been fully traversed.
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                // Otherwise, add the current element from array2.
                result[k] = array2[j];
                j++;
            }

            // Move to the next position in the result array.
            k++;
        }

        // If array1 still has elements, copy the remaining ones into result.
        while (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }

        // if array2 still has elements, copy the remaining ones into result.
        while (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }

        System.out.println("Merged array: " + Arrays.toString(result));
    }
}