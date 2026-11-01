public class InPlaceArrayReversal {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length / 2; i++) {
            int aux = nums[i];
            nums[i] = nums[(nums.length - 1) - i];
            nums[(nums.length - 1) - i] = aux;
        }

        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}