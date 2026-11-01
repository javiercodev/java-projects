import java.util.Scanner;

public class CheckArrayAscendingOrder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] nums = new int[8];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a value for position " + (i + 1) + ": ");
            int value = s.nextInt();
            nums[i] = value;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                System.out.println("an out-of-order pair has been found!");
                return;
            } 
        }

        System.out.println("numbers in order: yes");
    }
}