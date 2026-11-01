import java.util.Arrays;

public class ArrayReferenceVsCopy {
    
    public static void main(String[] args) {

        // The array is not copied. Both variables reference the same array in memory.
        // Therefore, modifying b also changes the array referenced by a.
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
        System.out.println(Arrays.toString(b));

        // Here's the solution:
        // Create an independent copy of array a.
        int[] c = Arrays.copyOf(a, a.length);
        // Modify the first element of array c.
        c[0] = 50;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
    }
}
