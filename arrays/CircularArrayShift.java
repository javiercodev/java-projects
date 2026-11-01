public class CircularArrayShift {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int aux = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = aux;

        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}