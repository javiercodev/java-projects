public class BinarySearch {

    public static void main(String[] args) {
        int[] vector = {7, 25, 31, 69, 72, 85, 97};
        System.out.println(binarySearch(vector, 69));
    }

    // Search for a target value in a sorted array using binary search.
    private static int binarySearch(int[] values, int target) {
        int low = 0;
        int high = values.length - 1;
        while (low <= high) {
            // Calculate the middle position while avoiding integer overflow.
            int mid = low + (high - low) / 2;
            if (values[mid] == target) { return mid; }
            if (values[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}