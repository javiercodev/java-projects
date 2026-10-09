public class MultiplyArrayValues {
    
    public static void main(String[] args) {

        int[] n = new int[7];

        n[0] = 5;
        n[1] = 10;
        n[2] = 15;
        n[3] = n[0]  * 4;
        n[4] = n[0]  * 5;
        n[5] = n[1] * 3;
        n[6] = 35;

        for (int i = 0; i <= 6; i++) {
            System.out.println(n[i]);
        }
    }
}







