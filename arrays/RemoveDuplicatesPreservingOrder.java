import java.util.Arrays;
import java.util.Random;


public class RemoveDuplicatesPreservingOrder {

    public static void main(String[] args) {

        Random r = new Random();
        int[] randomArray = new int[15];
        // Fill the array with random numbers between 1 and 10.
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(10) + 1;
        }

        System.out.println("Original: " + Arrays.toString(randomArray));

        // Create a second array to store unique values.
        int[] nums = new int[randomArray.length];
        // Keep track of the next available position in nums.
        int uniqueIndex = 0;
        // Go through each element of the original array.
        for (int i = 0; i < randomArray.length; i++) {
            // Assume the current number has not appeared before.
            boolean alreadyExists = false;
            // Check whether the current number is already in nums.
            for (int j = 0; j < uniqueIndex; j++) {
                // The number already exists, so we stop searching.
                if (randomArray[i] == nums[j]) {
                    alreadyExists = true;
                    break;
                }
            }
            // If the number is not already in nums, add it to nums.
            if(!alreadyExists) {
                nums[uniqueIndex] = randomArray[i];
                uniqueIndex++;
            }
        }
        // Resize nums to remove unused positions.
        nums = Arrays.copyOf(nums, uniqueIndex);
        System.out.println("Without duplicates: " + Arrays.toString(nums));
    }
}