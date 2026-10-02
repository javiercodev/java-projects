import java.util.Scanner;

public class BasePower {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce the base: ");
        int base = s.nextInt();
        System.out.print("Introduce the power: ");
        int power = s.nextInt();

        int result = 0;
        int test = 0;
        int baseRepeat = 1;
        int constant = base;

        for (int i = 1; i < power; i++) {
            
            if (i == 1) {
                System.out.println(base);
            }
            base = constant * base;
            System.out.println(base);
        }
    }
}