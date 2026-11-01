import java.util.Random;
import java.util.Arrays;

public class BubbleSortArray {

    public static void main(String[] args) {

        Random r = new Random();
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            // Fill the array with random integers.
            randomArray[i] = r.nextInt();
        }

        System.out.println(Arrays.toString(randomArray));

        // Outer loop: repeat the process until all elements are sorted.
        for (int i = 0; i < randomArray.length - 1; i++) {
            // Inner loop: compare adjacent elements.
            // After each pass, the largest unsorted element moves to the end.
            for (int j = 0; j < randomArray.length - 1 - i; j++) {
                // If the current element is greater than the next one, swap them.
                if (randomArray[j] > randomArray[j + 1]) {
                    // Store the current value temporarily.
                    int aux = randomArray[j]; 
                    // Move the next value to the current position.
                    randomArray[j] = randomArray[j + 1]; 
                    // Place the stored value in the next position.
                    randomArray[j + 1] = aux; 
                }
            }
            System.out.println(Arrays.toString(randomArray));
        }
    } 
}