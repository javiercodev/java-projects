public class Multiples {

    public static void main(String[] args) {
        int base = 5;
        int i = 0;
        int multiplier = 0;

        while(i <= 100) {
        System.out.println(i);
        multiplier ++;
        i = base * multiplier;
        }
    }
}