import java.util.Scanner;

public class CheckPalindromeArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] nums = new int[7];
        // Ask the user to enter a number for each position.
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number for position " + (i + 1) + ": ");
            nums[i] = s.nextInt();
        }

        // Count how many pairs of symetrical elements match.
        int coincidences = 0;
        // Only compare the first half of the array with the second half.
        for (int i = 0; i < nums.length / 2; i++) {
            // Compare each element with its symetrical counterpart.
            if (nums[i] == nums[nums.length - 1 - i]) {
                coincidences++;
            }
        }

        // If all symetrical pairs match, the array is a palindrome.
        if (coincidences == nums.length / 2) {
            System.out.println("The array is a palindrome!");
        } else {
            System.out.println("The array is not a palindrome.");
        }
        
        s.close();
    }
}