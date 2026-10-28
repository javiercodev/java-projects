public class FillArrayWithEvenNumbers {

    public static void main(String[] args) {

        int num = 1;
        int[] even = new int[20];
        for (int i = 0; i < even.length; i++) {
           even[i] = num * 2;
           num++;
        }

        for (int j : even) {
            System.out.print(j + " ");
        }
    }
}