public class InitializeCharArray {

    public static void main(String[] args) {

        char[] values = new char[10];
        values[0] = 'a';
        values[1] = 'X';
        values[4] = '@';
        values[6] = ' ';
        values[7] = '+';
        values[8] = 'Q';

        for (int i = 0; i < 10; i++) {
            System.out.println(values[i]);
        }
    }
}