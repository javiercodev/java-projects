public class FindMaximumArrayElement {

    public static void main(String[] args) {

        int[] array = {55, 69, 32, 47};

        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.print(max);
    }
}