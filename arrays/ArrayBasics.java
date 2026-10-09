public class ArrayBasics {

    public static void main(String[] args) {

        int [] n;
        n = new int[4];

        n[0] = 26;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;

        System.out.print("The values of array n are as follows: ");
        System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

        int sum = n[0] + n[3];
        System.out.print("The sum of the first element of the array and the last: " + sum);
    }
}